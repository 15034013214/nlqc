package com.zk.nlqc.web.screens.qcrecordarchive;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.recordArchive.QcRecordArchive;

@UiController("nlqc_QcRecordArchive.browse")
@UiDescriptor("qc-record-archive-browse.xml")
@LookupComponent("qcRecordArchivesTable")
@LoadDataBeforeShow
public class QcRecordArchiveBrowse extends StandardLookup<QcRecordArchive> {
}