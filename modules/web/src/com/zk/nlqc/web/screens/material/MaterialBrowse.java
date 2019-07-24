package com.zk.nlqc.web.screens.material;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.Material;

@UiController("nlqc_Material.browse")
@UiDescriptor("material-browse.xml")
@LookupComponent("materialsTable")
@LoadDataBeforeShow
public class MaterialBrowse extends StandardLookup<Material> {
}