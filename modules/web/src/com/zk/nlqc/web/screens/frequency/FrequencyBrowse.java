package com.zk.nlqc.web.screens.frequency;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.Frequency;

@UiController("nlqc_Frequency.browse")
@UiDescriptor("frequency-browse.xml")
@LookupComponent("frequenciesTable")
@LoadDataBeforeShow
public class FrequencyBrowse extends StandardLookup<Frequency> {
}