package com.zk.nlqc.web.screens.finalrecord;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.record.FinalRecord;

@UiController("nlqc_FinalRecord.edit")
@UiDescriptor("final-record-edit.xml")
@EditedEntityContainer("finalRecordDc")
@LoadDataBeforeShow
public class FinalRecordEdit extends StandardEditor<FinalRecord> {
}