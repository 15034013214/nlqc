package com.zk.nlqc.web.screens.device;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.Device;

@UiController("nlqc_Device.edit")
@UiDescriptor("device-edit.xml")
@EditedEntityContainer("deviceDc")
@LoadDataBeforeShow
public class DeviceEdit extends StandardEditor<Device> {
}