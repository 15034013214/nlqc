package com.zk.nlqc.web.screens.carmodel;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.CarModel;

@UiController("nlqc_CarModel.browse")
@UiDescriptor("car-model-browse.xml")
@LookupComponent("carModelsTable")
@LoadDataBeforeShow
public class CarModelBrowse extends StandardLookup<CarModel> {
}