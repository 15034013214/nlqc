package com.zk.nlqc.web.screens.qcflow;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.complex.QcFlow;

import javax.inject.Inject;

@UiController("nlqc_QcFlow.browse")
@UiDescriptor("qc-flow-browse.xml")
@LookupComponent("qcFlowsTable")
@LoadDataBeforeShow
public class QcFlowBrowse extends StandardLookup<QcFlow> {
    @Inject
    private DataManager dataManager;
    @Inject
    private CollectionLoader<QcFlow> qcFlowsDl;
    @Inject
    private GroupTable<QcFlow> qcFlowsTable;
    @Inject
    private Button isUseButton;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        initTableStyle();
    }

    /**
     * 初始化表格的样式
     */
    private void initTableStyle() {
        qcFlowsTable.setStyleProvider((entity, property) -> {
            if (!entity.getIsUse()) {
                return "imported-table-rad";
            }else {
                return "";
            }
        });
    }

    /**
     * “启用/禁用”按钮在选择了行的情况下可以点击
     * @param event
     */
    @Subscribe("qcFlowsTable")
    private void onQcFlowsTableSelection(Table.SelectionEvent<QcFlow> event) {
        QcFlow selectQcFlow = qcFlowsTable.getSingleSelected();
        if(null != selectQcFlow){
            isUseButton.setEnabled(true);
            if(selectQcFlow.getIsUse()){
                buttonIsUseShow(false);
            }else {
                buttonIsUseShow(true);
            }
        }else {
            isUseButton.setEnabled(false);
        }
    }

    /**
     * 启用禁用质检标准
     */
    public void isUseButtonAction() {
        QcFlow selectQcFlow = qcFlowsTable.getSingleSelected();
        if(null != selectQcFlow){
            if(selectQcFlow.getIsUse()){
                selectQcFlow.setIsUse(false);
                buttonIsUseShow(true);
            }else {
                selectQcFlow.setIsUse(true);
                buttonIsUseShow(false);
            }
            dataManager.commit(selectQcFlow);
            qcFlowsDl.load();
        }
    }

    /**
     * 启用禁用按钮的切换
     * @param isUse true:显示启用 false：显示禁用
     */
    private void buttonIsUseShow(boolean isUse){
        if(isUse){
            isUseButton.setCaption("启用");
            isUseButton.setIconFromSet(CubaIcon.CHAIN);
        }else {
            isUseButton.setCaption("禁用");
            isUseButton.setIconFromSet(CubaIcon.CHAIN_BROKEN);
        }
    }
}