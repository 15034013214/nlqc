package com.zk.nlqc.web.screens.finalrecord;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.record.FinalRecord;

@UiController("nlqc_FinalRecord.browse")
@UiDescriptor("final-record-browse.xml")
@LookupComponent("finalRecordsTable")
@LoadDataBeforeShow
public class FinalRecordBrowse extends StandardLookup<FinalRecord> {
}