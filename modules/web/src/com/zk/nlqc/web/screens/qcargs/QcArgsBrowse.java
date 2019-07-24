package com.zk.nlqc.web.screens.qcargs;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.QcArgs;

@UiController("nlqc_QcArgs.browse")
@UiDescriptor("qc-args-browse.xml")
@LookupComponent("qcArgsesTable")
@LoadDataBeforeShow
public class QcArgsBrowse extends StandardLookup<QcArgs> {
}