package com.zk.nlqc.web.screens.qcargs;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.QcArgs;

@UiController("nlqc_QcArgs.edit")
@UiDescriptor("qc-args-edit.xml")
@EditedEntityContainer("qcArgsDc")
@LoadDataBeforeShow
public class QcArgsEdit extends StandardEditor<QcArgs> {
}