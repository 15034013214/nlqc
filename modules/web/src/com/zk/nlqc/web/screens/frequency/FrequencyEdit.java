package com.zk.nlqc.web.screens.frequency;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.Frequency;

@UiController("nlqc_Frequency.edit")
@UiDescriptor("frequency-edit.xml")
@EditedEntityContainer("frequencyDc")
@LoadDataBeforeShow
public class FrequencyEdit extends StandardEditor<Frequency> {
}