package com.zk.nlqc.entitys.recordArchive;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s %s|carModelNo,qcWorkStationName")
@Table(name = "NLQC_QC_RECORD_ARCHIVE")
@Entity(name = "nlqc_QcRecordArchive")
public class QcRecordArchive extends StandardEntity {
    private static final long serialVersionUID = -567051553715252331L;

    @Column(name = "QC_RECORD_BILL_ITEM")
    protected String qcRecordBillItem;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME")
    protected Date createTime;

    @Column(name = "CAR_MODEL_NO")
    protected String carModelNo;

    @Column(name = "QC_WORK_STATION_NO")
    protected String qcWorkStationNo;

    @Column(name = "QC_WORK_STATION_NAME")
    protected String qcWorkStationName;

    @Column(name = "QC_ARGS_NO")
    protected String qcArgsNo;

    @Column(name = "QC_ARGS_TYPE")
    protected String qcArgsType;

    @Column(name = "QC_TYPE")
    protected String qcType;

    @Column(name = "QC_USER")
    protected String qcUser;

    @Column(name = "KEY_MATERIAL_NO")
    protected String keyMaterialNo;

    @Column(name = "ACTUAL_MATERIAL_NO")
    protected String actualMaterialNo;

    @Column(name = "QC_DEVICE_NO")
    protected String qcDeviceNo;

    @Column(name = "ACTUAL_DEVICE_NO")
    protected String actualDeviceNo;

    @Column(name = "NORM_VALUE")
    protected Long normValue;

    @Column(name = "UP_VALUE")
    protected Long upValue;

    @Column(name = "DOWN_VALUE")
    protected Long downValue;

    @Column(name = "ACTUAL_VALUE")
    protected Long actualValue;

    @Column(name = "UNIT")
    protected String unit;

    @Column(name = "FIRST_HZ")
    protected String firstHz;

    @Column(name = "INITIATIVE_HZ")
    protected String initiativeHz;

    @Column(name = "LAST_HZ")
    protected String lastHz;

    @Column(name = "CIRCLE_HZ")
    protected String circleHz;

    @Column(name = "QC_TIME")
    protected String qcTime;

    @Column(name = "IS_CONTROL")
    protected Boolean isControl;

    @Column(name = "QC_RESULT")
    protected String qcResult;

    @Column(name = "ITEM_NOTE")
    protected String itemNote;

    public String getItemNote() {
        return itemNote;
    }

    public void setItemNote(String itemNote) {
        this.itemNote = itemNote;
    }

    public String getQcResult() {
        return qcResult;
    }

    public void setQcResult(String qcResult) {
        this.qcResult = qcResult;
    }

    public Boolean getIsControl() {
        return isControl;
    }

    public void setIsControl(Boolean isControl) {
        this.isControl = isControl;
    }

    public String getQcTime() {
        return qcTime;
    }

    public void setQcTime(String qcTime) {
        this.qcTime = qcTime;
    }

    public String getCircleHz() {
        return circleHz;
    }

    public void setCircleHz(String circleHz) {
        this.circleHz = circleHz;
    }

    public String getLastHz() {
        return lastHz;
    }

    public void setLastHz(String lastHz) {
        this.lastHz = lastHz;
    }

    public String getInitiativeHz() {
        return initiativeHz;
    }

    public void setInitiativeHz(String initiativeHz) {
        this.initiativeHz = initiativeHz;
    }

    public String getFirstHz() {
        return firstHz;
    }

    public void setFirstHz(String firstHz) {
        this.firstHz = firstHz;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getActualValue() {
        return actualValue;
    }

    public void setActualValue(Long actualValue) {
        this.actualValue = actualValue;
    }

    public Long getDownValue() {
        return downValue;
    }

    public void setDownValue(Long downValue) {
        this.downValue = downValue;
    }

    public Long getUpValue() {
        return upValue;
    }

    public void setUpValue(Long upValue) {
        this.upValue = upValue;
    }

    public void setNormValue(Long normValue) {
        this.normValue = normValue;
    }

    public Long getNormValue() {
        return normValue;
    }

    public String getActualDeviceNo() {
        return actualDeviceNo;
    }

    public void setActualDeviceNo(String actualDeviceNo) {
        this.actualDeviceNo = actualDeviceNo;
    }

    public String getQcDeviceNo() {
        return qcDeviceNo;
    }

    public void setQcDeviceNo(String qcDeviceNo) {
        this.qcDeviceNo = qcDeviceNo;
    }

    public String getActualMaterialNo() {
        return actualMaterialNo;
    }

    public void setActualMaterialNo(String actualMaterialNo) {
        this.actualMaterialNo = actualMaterialNo;
    }

    public String getKeyMaterialNo() {
        return keyMaterialNo;
    }

    public void setKeyMaterialNo(String keyMaterialNo) {
        this.keyMaterialNo = keyMaterialNo;
    }

    public String getQcUser() {
        return qcUser;
    }

    public void setQcUser(String qcUser) {
        this.qcUser = qcUser;
    }

    public String getQcType() {
        return qcType;
    }

    public void setQcType(String qcType) {
        this.qcType = qcType;
    }

    public String getQcArgsType() {
        return qcArgsType;
    }

    public void setQcArgsType(String qcArgsType) {
        this.qcArgsType = qcArgsType;
    }

    public String getQcArgsNo() {
        return qcArgsNo;
    }

    public void setQcArgsNo(String qcArgsNo) {
        this.qcArgsNo = qcArgsNo;
    }

    public String getQcWorkStationName() {
        return qcWorkStationName;
    }

    public void setQcWorkStationName(String qcWorkStationName) {
        this.qcWorkStationName = qcWorkStationName;
    }

    public String getQcWorkStationNo() {
        return qcWorkStationNo;
    }

    public void setQcWorkStationNo(String qcWorkStationNo) {
        this.qcWorkStationNo = qcWorkStationNo;
    }

    public String getCarModelNo() {
        return carModelNo;
    }

    public void setCarModelNo(String carModelNo) {
        this.carModelNo = carModelNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getQcRecordBillItem() {
        return qcRecordBillItem;
    }

    public void setQcRecordBillItem(String qcRecordBillItem) {
        this.qcRecordBillItem = qcRecordBillItem;
    }
}