package com.zk.nlqc.web.screens.qcitem;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.complex.QcItem;

@UiController("nlqc_QcItem.browse")
@UiDescriptor("qc-item-browse.xml")
@LookupComponent("qcItemsTable")
@LoadDataBeforeShow
public class QcItemBrowse extends StandardLookup<QcItem> {
}