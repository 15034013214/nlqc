package com.zk.nlqc.web.screens.qcitem;

import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.Device;
import com.zk.nlqc.entitys.base.Material;
import com.zk.nlqc.entitys.base.QcArgs;
import com.zk.nlqc.entitys.complex.QcItem;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("nlqc_QcItem.edit")
@UiDescriptor("qc-item-edit.xml")
@EditedEntityContainer("qcItemDc")
@LoadDataBeforeShow
public class QcItemEdit extends StandardEditor<QcItem> {
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

    @Subscribe("qcArgsField")
    private void onQcArgsFieldValueChange(HasValue.ValueChangeEvent<QcArgs> event) {
       String qcArgsType =  qcArgsField.getValue().getQcArgsType();
        switch (qcArgsType){
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