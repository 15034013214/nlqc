package com.zk.nlqc.web.screens.workstation;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.complex.WorkStation;

@UiController("nlqc_WorkStation.edit")
@UiDescriptor("work-station-edit.xml")
@EditedEntityContainer("workStationDc")
@LoadDataBeforeShow
public class WorkStationEdit extends StandardEditor<WorkStation> {
}