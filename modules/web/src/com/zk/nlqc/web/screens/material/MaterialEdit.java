package com.zk.nlqc.web.screens.material;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.Material;

@UiController("nlqc_Material.edit")
@UiDescriptor("material-edit.xml")
@EditedEntityContainer("materialDc")
@LoadDataBeforeShow
public class MaterialEdit extends StandardEditor<Material> {
}