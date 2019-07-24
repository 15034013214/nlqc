package com.zk.nlqc.web.screens.qcflow;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.complex.QcFlow;

@UiController("nlqc_QcFlow.edit")
@UiDescriptor("qc-flow-edit.xml")
@EditedEntityContainer("qcFlowDc")
@LoadDataBeforeShow
public class QcFlowEdit extends StandardEditor<QcFlow> {
}