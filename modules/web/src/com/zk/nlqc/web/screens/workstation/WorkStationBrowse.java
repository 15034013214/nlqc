package com.zk.nlqc.web.screens.workstation;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.complex.WorkStation;

@UiController("nlqc_WorkStation.browse")
@UiDescriptor("work-station-browse.xml")
@LookupComponent("workStationsTable")
@LoadDataBeforeShow
public class WorkStationBrowse extends StandardLookup<WorkStation> {
}