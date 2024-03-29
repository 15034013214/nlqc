package com.zk.nlqc.web.screens.qcitem;

import com.haulmont.cuba.core.global.EntityStates;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.Device;
import com.zk.nlqc.entitys.base.Material;
import com.zk.nlqc.entitys.base.QcArgs;
import com.zk.nlqc.entitys.complex.QcItem;
import com.zk.nlqc.service.ToolsService;
import com.zk.nlqc.web.screens.qcflow.QcParam;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

@UiController("nlqc_QcItem.edit")
@UiDescriptor("qc-item-edit.xml")
@EditedEntityContainer("qcItemDc")
@LoadDataBeforeShow
public class QcItemEdit extends StandardEditor<QcItem> {
    @Inject
    private CollectionLoader<QcArgs> qcArgsesLc;
    @Inject
    private LookupPickerField<QcArgs> qcArgsField;
    @Inject
    private LookupPickerField<Device> deviceField;
    @Inject
    private LookupPickerField<Material> mateialField;
    @Inject
    private TextField<BigDecimal> belowValueField;
    @Inject
    private TextField<BigDecimal> normValueField;
    @Inject
    private TextField<BigDecimal> upValueField;
    @Inject
    private TextField<String> unitField;
    @Inject
    private EntityStates entityStates;
    @Inject
    private TextField<String> qcItemNoField;

    // 为创建界面分配的编号
    private String qcQcItemNo;
    /**
     * 初始化的时候获取到参数，然后更新DL
     * @param event
     */
    @Subscribe
    private void onInit(InitEvent event) {
        ScreenOptions options = event.getOptions();
        if (options instanceof QcParam) {
            List<QcArgs> args = ((QcParam) options).getQcArgs();
            qcQcItemNo = ((QcParam) options).getQcItemNo();
            qcArgsesLc.setQuery("select e from nlqc_QcArgs e where e in :qcAllArgs and e.qcArgsType <> :qcType");
            qcArgsesLc.setParameter("qcAllArgs" , args);
            qcArgsesLc.setParameter("qcType" , "设备检测");
            qcArgsesLc.load();
        }
    }

    /**
     * 填写编号
     * @param event
     */
    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        if(entityStates.isNew(getEditedEntity())){
            if(!StringUtils.isEmpty(qcQcItemNo)){
                qcItemNoField.setValue(qcQcItemNo);
            }
        }
        qcItemNoField.setEditable(false);
    }

    @Subscribe("qcArgsField")
    private void onQcArgsFieldValueChange(HasValue.ValueChangeEvent<QcArgs> event) {
        QcArgs qcArgs = qcArgsField.getValue();
        if(null == qcArgs){
            allEnabled();
        }else{
            switch (qcArgs.getQcArgsType()){
                case "质量检测":
                    deviceField.clear();
                    mateialField.clear();
                    allEnabled();
                    belowValueField.setEditable(true);
                    normValueField.setEditable(true);
                    upValueField.setEditable(true);
                    unitField.setEditable(true);
                    break;
                case "外观检测":
                    deviceField.clear();
                    mateialField.clear();
                    belowValueField.clear();
                    normValueField.clear();
                    upValueField.clear();
                    allEnabled();
                    break;
                case "物料检测":
                    deviceField.clear();
                    belowValueField.clear();
                    normValueField.clear();
                    upValueField.clear();
                    allEnabled();
                    mateialField.setEnabled(true);
                    break;
                case "设备检测":
                    mateialField.clear();
                    belowValueField.clear();
                    normValueField.clear();
                    upValueField.clear();
                    allEnabled();
                    deviceField.setEnabled(true);
                    break;
            }
        }

    }

    /**
     * 将所有的框体设置为不可编辑
     */
    private void allEnabled(){
        deviceField.setEnabled(false);
        mateialField.setEnabled(false);
        belowValueField.setEditable(false);
        normValueField.setEditable(false);
        upValueField.setEditable(false);
        unitField.setEditable(false);
    }
}