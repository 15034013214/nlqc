package com.zk.nlqc.web.screens.qcflow;

import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.QcArgs;
import com.zk.nlqc.entitys.complex.QcCourse;
import com.zk.nlqc.entitys.complex.QcFlow;
import com.zk.nlqc.entitys.complex.QcItem;
import com.zk.nlqc.entitys.complex.WorkStation;
import com.zk.nlqc.web.screens.qcitem.QcItemEdit;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@UiController("nlqc_QcFlow.edit")
@UiDescriptor("qc-flow-edit.xml")
@EditedEntityContainer("qcFlowDc")
@LoadDataBeforeShow
public class QcFlowEdit extends StandardEditor<QcFlow> {
    @Inject
    private InstanceContainer<QcFlow> qcFlowDc;
    @Inject
    private CollectionPropertyContainer<QcItem> qcFlowQcItemsDc;
    @Inject
    private CollectionLoader<WorkStation> workStationsLc;
    @Inject
    private LookupPickerField<WorkStation> workStationField;
    @Inject
    private Button createButton;
    @Inject
    private GroupTable<QcItem> qcFlowQcItemTable;
    @Inject
    private LookupPickerField<QcCourse> qcCourseField;
    @Inject
    private ScreenBuilders screenBuilders;

    /**
     * 工站是根据的条件是该质检途程中含有该工作。
     */
    @Subscribe("qcCourseField")
    private void onQcCourseFieldValueChange(HasValue.ValueChangeEvent<QcCourse> event) {
        QcCourse nowQcCourse = qcFlowDc.getItem().getQcCourse();
        if(null != nowQcCourse){
            workStationsLc.setParameter("workStations" , nowQcCourse.getWorkStation());
        }else {
            workStationField.clear();
            workStationsLc.setParameter("workStations" , new ArrayList<WorkStation>());
        }
        workStationsLc.load();
    }

    @Subscribe
    private void onAfterShow(AfterShowEvent event) {
        setQcItemEnable();
    }

    @Subscribe("workStationField")
    private void onWorkStationFieldValueChange(HasValue.ValueChangeEvent<WorkStation> event) {
        setQcItemEnable();
    }

    /**
     * 之间项表格发生变化时调用
     * @param event 表格没有内容：可以操作质检途程和质检工作站，否则：不能操作。
     */
    @Subscribe(id = "qcFlowQcItemsDc", target = Target.DATA_CONTAINER)
    private void onQcFlowQcItemsDcCollectionChange(CollectionContainer.CollectionChangeEvent<QcItem> event) {
        setQcCurseAndWorkStationEnable();
    }

    /**
     * 是否可以添加配置项
     * 判断工作站是否有内容，有则可以，无则不可以。
     */
    private void setQcItemEnable(){
        if(null != workStationField.getValue()){
            createButton.setEnabled(true);
        }else {
            createButton.setEnabled(false);
        }
    }

    /**
     * 含有之间项的时候不能修改质检途程和工作站。
     */
    private void setQcCurseAndWorkStationEnable(){
        if(qcFlowQcItemsDc.getItems().size() > 0){
            workStationField.setEnabled(false);
            qcCourseField.setEnabled(false);

        }else {
            workStationField.setEnabled(true);
            qcCourseField.setEnabled(true);
        }
    }

    public void setParameterInvoke() {
        // 可以选择的质检参数列表
        List<QcArgs> qcArgs = workStationField.getValue().getQcArgs();
        QcParam qcParam = new QcParam(qcArgs);
        screenBuilders.editor(qcFlowQcItemTable)
                .newEntity()
                .withScreenClass(QcItemEdit.class)
                .withLaunchMode(OpenMode.THIS_TAB)
                .withOptions(qcParam)//封装后的参数
                .build()
                .show();
    }
}