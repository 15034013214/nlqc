package com.zk.nlqc.web.screens.carmodel;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.CarModel;

@UiController("nlqc_CarModel.edit")
@UiDescriptor("car-model-edit.xml")
@EditedEntityContainer("carModelDc")
@LoadDataBeforeShow
public class CarModelEdit extends StandardEditor<CarModel> {
}