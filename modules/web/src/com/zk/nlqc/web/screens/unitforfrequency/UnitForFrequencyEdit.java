package com.zk.nlqc.web.screens.unitforfrequency;

import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.UnitForFrequency;
import com.zk.nlqc.enums.FrequencyUnitEnum;

import javax.inject.Inject;

@UiController("nlqc_UnitForFrequency.edit")
@UiDescriptor("unit-for-frequency-edit.xml")
@EditedEntityContainer("unitForFrequencyDc")
@LoadDataBeforeShow
public class UnitForFrequencyEdit extends StandardEditor<UnitForFrequency> {
    @Inject
    private TextField<Integer> valueField;
    @Inject
    private LookupField<FrequencyUnitEnum> unitField;
    @Inject
    private TextField<String> unitNameField;

    @Subscribe("valueField")
    private void onValueFieldValueChange(HasValue.ValueChangeEvent<Integer> event) {
        groupValueAndUnit();
    }

    @Subscribe("unitField")
    private void onUnitFieldValueChange(HasValue.ValueChangeEvent<FrequencyUnitEnum> event) {
        groupValueAndUnit();
    }

    /**
     * 拼接数值和单位形成 “2分钟”的格式。
     */
    private void groupValueAndUnit(){
        Integer value = valueField.getValue();
        FrequencyUnitEnum unitEnum = unitField.getValue();
        if(null != value && null != unitEnum){
            switch (unitEnum){
                case MONTH:
                    unitNameField.setValue("" + value + "月");
                    break;
                case DAY:
                    unitNameField.setValue("" + value + "天");
                    break;
                case HOUR:
                    unitNameField.setValue("" + value + "小时");
                    break;
                case MINUTE:
                    unitNameField.setValue("" + value + "分钟");
                    break;
                case PIECE:
                    unitNameField.setValue("" + value + "件");
                    break;
            }
        }else {
            unitNameField.clear();
        }
    }
    



}