package com.zk.nlqc.web.screens.qcflow;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.complex.QcFlow;

@UiController("nlqc_QcFlow.browse")
@UiDescriptor("qc-flow-browse.xml")
@LookupComponent("qcFlowsTable")
@LoadDataBeforeShow
public class QcFlowBrowse extends StandardLookup<QcFlow> {
}