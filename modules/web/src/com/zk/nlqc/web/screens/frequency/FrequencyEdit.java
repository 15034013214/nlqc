package com.zk.nlqc.web.screens.frequency;

import com.haulmont.cuba.core.global.EntityStates;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.Frequency;
import com.zk.nlqc.entitys.base.UnitForFrequency;
import com.zk.nlqc.service.ToolsService;

import javax.inject.Inject;

@UiController("nlqc_Frequency.edit")
@UiDescriptor("frequency-edit.xml")
@EditedEntityContainer("frequencyDc")
@LoadDataBeforeShow
public class FrequencyEdit extends StandardEditor<Frequency> {
    @Inject
    private LookupPickerField<UnitForFrequency> unitField;
    @Inject
    private TextField<Integer> quantityField;
    @Inject
    private CheckBox isInfinityBigField;
    @Inject
    private TextField<String> showTextField;
    @Inject
    private TextField<String> frequencyNoField;
    @Inject
    private ToolsService toolsService;
    @Inject
    private EntityStates entityStates;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        if(entityStates.isNew(getEditedEntity())){
            frequencyNoField.setValue(toolsService.getNumberByClassAndDate("Frequency" , "NLQC_FREQUENCY" , "yyMM" ,3 , false));
        }
        frequencyNoField.setEditable(false);
    }

    @Subscribe("quantityField")
    private void onQuantityFieldValueChange(HasValue.ValueChangeEvent<String> event) {
        doAction();
    }

    @Subscribe("unitField")
    private void onUnitFieldValueChange(HasValue.ValueChangeEvent<UnitForFrequency> event) {
        doAction();
    }

    @Subscribe("isInfinityBigField")
    private void onIsInfinityBigFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        doAction();
    }

    /**
     * 监听字段变化之后调用。
     * 1：是否全检为True：清空其他字段的值，显示字段设为“全检”。
     * 2：全检为False &&  数值和单位都有值时：拼接显示字段。
     */
    private void doAction(){
        boolean isQj = isInfinityBigField.getValue();
        if(isQj){
            unitField.clear();
            quantityField.clear();
            showTextField.setValue("全检");
        }else {
            showTextField.clear();
            Integer quantity = quantityField.getValue();
            UnitForFrequency unit = unitField.getValue();
            if(null != quantity && null != unit){
                showTextField.setValue("" + quantity + "次/" + unit.getUnitName());
            }
        }
    }
}