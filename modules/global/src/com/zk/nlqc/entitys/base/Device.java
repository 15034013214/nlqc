package com.zk.nlqc.entitys.base;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|deviceNo,deviceName")
@Table(name = "NLQC_DEVICE")
@Entity(name = "nlqc_Device")
public class Device extends StandardEntity {
    private static final long serialVersionUID = -2159524567819660822L;

    @NotNull
    @Column(name = "DEVICE_NO", nullable = false, unique = true)
    protected String deviceNo;

    @NotNull
    @Column(name = "DEVICE_NAME", nullable = false)
    protected String deviceName;

    @Column(name = "DEVICE_MODEL")
    protected String deviceModel;

    @Column(name = "DEVICE_STATUS")
    protected String deviceStatus;

    @Column(name = "NOTE")
    protected String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }
}