package com.zk.nlqc.web.screens.qcrecordarchive;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.recordArchive.QcRecordArchive;

@UiController("nlqc_QcRecordArchive.edit")
@UiDescriptor("qc-record-archive-edit.xml")
@EditedEntityContainer("qcRecordArchiveDc")
@LoadDataBeforeShow
public class QcRecordArchiveEdit extends StandardEditor<QcRecordArchive> {
}