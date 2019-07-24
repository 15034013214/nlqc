package com.zk.nlqc.web.screens.device;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.base.Device;

@UiController("nlqc_Device.browse")
@UiDescriptor("device-browse.xml")
@LookupComponent("devicesTable")
@LoadDataBeforeShow
public class DeviceBrowse extends StandardLookup<Device> {
}