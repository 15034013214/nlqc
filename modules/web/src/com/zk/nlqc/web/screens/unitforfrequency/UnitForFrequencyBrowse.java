package com.zk.nlqc.web.screens.unitforfrequency;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.UnitForFrequency;

@UiController("nlqc_UnitForFrequency.browse")
@UiDescriptor("unit-for-frequency-browse.xml")
@LookupComponent("unitForFrequenciesTable")
@LoadDataBeforeShow
public class UnitForFrequencyBrowse extends StandardLookup<UnitForFrequency> {
}