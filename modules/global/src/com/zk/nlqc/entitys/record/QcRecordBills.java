package com.zk.nlqc.entitys.record;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "NLQC_QC_RECORD_ITEM")
@Entity(name = "nlqc_QcRecordItem")
public class QcRecordBills extends StandardEntity {
    private static final long serialVersionUID = -2788364256066130487L;

    @Column(name = "FLOW_NO")
    protected String flowNo;

    @Column(name = "CAR_MODEL_NO")
    protected String carModelNo;

    @Column(name = "QC_WORK_STATION_NO")
    protected String qcWorkStationNo;

    @Column(name = "QC_WORK_STATION_NAME")
    protected String qcWorkStationName;

    @Column(name = "QC_TYPE")
    protected String qcType;

    @Column(name = "QC_ARGS_NO")
    protected String qcArgsNo;

    @Column(name = "QC_ARGS_TYPE")
    protected String qcArgsType;

    @Column(name = "QC_ITEM_NO")
    protected String qcItemNo;

    @Column(name = "QC_ITEM_NAME")
    protected String qcItemName;

    @Column(name = "KEY_MATERIAL_NO")
    protected String keyMaterialNo;

    @Column(name = "KEY_MATERIAL_NAME")
    protected String keyMaterialName;

    @Column(name = "REALITY_IN_MATERIAL_NO")
    protected String realityInMaterialNo;

    @Column(name = "KEY_DEVICE_NO")
    protected String keyDeviceNo;

    @Column(name = "KEY_DEVICE_NAME")
    protected String keyDeviceName;

    @Column(name = "NORM_VALUE")
    protected BigDecimal normValue;

    @Column(name = "UP_VALUE")
    protected BigDecimal upValue;

    @Column(name = "BELOW_VALUE")
    protected BigDecimal belowValue;

    @Column(name = "REALITY_VALUE")
    protected BigDecimal realityValue;

    @Column(name = "UNIT")
    protected String unit;

    @Column(name = "FIRST_QC_FREQUENCY")
    protected String firstQcFrequency;

    @Column(name = "INITIATIVE_QC_FREQUENCY")
    protected String initiativeQcFrequency;

    @Column(name = "FINALLY_QC_FREQUENCY")
    protected String finallyQcFrequency;

    @Column(name = "ROUNDS_QC_FREQUENCY")
    protected String roundsQcFrequency;

    @Column(name = "IS_CONTROL_ITEM")
    protected String isControlItem;

    @Column(name = "QC_DEVICE")
    protected String qcDevice;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "QC_TIME")
    protected Date qcTime;

    @Column(name = "IS_QUALIFIED")
    protected Boolean isQualified;

    @Column(name = "IS_GOBACK_REPAIR")
    protected Boolean isGobackRepair;

    @Column(name = "REFUSE_RECEIVE")
    protected Boolean refuseReceive;

    @Column(name = "FORCE_RECEIVE")
    protected Boolean forceReceive;

    @Column(name = "ONCE_PASS")
    protected Boolean oncePass;

    @Column(name = "NG_MESSAGE")
    protected String ngMessage;

    public String getNgMessage() {
        return ngMessage;
    }

    public void setNgMessage(String ngMessage) {
        this.ngMessage = ngMessage;
    }

    public Boolean getOncePass() {
        return oncePass;
    }

    public void setOncePass(Boolean oncePass) {
        this.oncePass = oncePass;
    }

    public void setForceReceive(Boolean forceReceive) {
        this.forceReceive = forceReceive;
    }

    public Boolean getForceReceive() {
        return forceReceive;
    }

    public Boolean getRefuseReceive() {
        return refuseReceive;
    }

    public void setRefuseReceive(Boolean refuseReceive) {
        this.refuseReceive = refuseReceive;
    }

    public Boolean getIsGobackRepair() {
        return isGobackRepair;
    }

    public void setIsGobackRepair(Boolean isGobackRepair) {
        this.isGobackRepair = isGobackRepair;
    }

    public Boolean getIsQualified() {
        return isQualified;
    }

    public void setIsQualified(Boolean isQualified) {
        this.isQualified = isQualified;
    }

    public Date getQcTime() {
        return qcTime;
    }

    public void setQcTime(Date qcTime) {
        this.qcTime = qcTime;
    }

    public String getQcDevice() {
        return qcDevice;
    }

    public void setQcDevice(String qcDevice) {
        this.qcDevice = qcDevice;
    }

    public String getIsControlItem() {
        return isControlItem;
    }

    public void setIsControlItem(String isControlItem) {
        this.isControlItem = isControlItem;
    }

    public String getRoundsQcFrequency() {
        return roundsQcFrequency;
    }

    public void setRoundsQcFrequency(String roundsQcFrequency) {
        this.roundsQcFrequency = roundsQcFrequency;
    }

    public String getFinallyQcFrequency() {
        return finallyQcFrequency;
    }

    public void setFinallyQcFrequency(String finallyQcFrequency) {
        this.finallyQcFrequency = finallyQcFrequency;
    }

    public String getInitiativeQcFrequency() {
        return initiativeQcFrequency;
    }

    public void setInitiativeQcFrequency(String initiativeQcFrequency) {
        this.initiativeQcFrequency = initiativeQcFrequency;
    }

    public String getFirstQcFrequency() {
        return firstQcFrequency;
    }

    public void setFirstQcFrequency(String firstQcFrequency) {
        this.firstQcFrequency = firstQcFrequency;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getRealityValue() {
        return realityValue;
    }

    public void setRealityValue(BigDecimal realityValue) {
        this.realityValue = realityValue;
    }

    public BigDecimal getBelowValue() {
        return belowValue;
    }

    public void setBelowValue(BigDecimal belowValue) {
        this.belowValue = belowValue;
    }

    public BigDecimal getUpValue() {
        return upValue;
    }

    public void setUpValue(BigDecimal upValue) {
        this.upValue = upValue;
    }

    public BigDecimal getNormValue() {
        return normValue;
    }

    public void setNormValue(BigDecimal normValue) {
        this.normValue = normValue;
    }

    public String getKeyDeviceName() {
        return keyDeviceName;
    }

    public void setKeyDeviceName(String keyDeviceName) {
        this.keyDeviceName = keyDeviceName;
    }

    public String getKeyDeviceNo() {
        return keyDeviceNo;
    }

    public void setKeyDeviceNo(String keyDeviceNo) {
        this.keyDeviceNo = keyDeviceNo;
    }

    public String getRealityInMaterialNo() {
        return realityInMaterialNo;
    }

    public void setRealityInMaterialNo(String realityInMaterialNo) {
        this.realityInMaterialNo = realityInMaterialNo;
    }

    public String getKeyMaterialName() {
        return keyMaterialName;
    }

    public void setKeyMaterialName(String keyMaterialName) {
        this.keyMaterialName = keyMaterialName;
    }

    public String getKeyMaterialNo() {
        return keyMaterialNo;
    }

    public void setKeyMaterialNo(String keyMaterialNo) {
        this.keyMaterialNo = keyMaterialNo;
    }

    public String getQcItemName() {
        return qcItemName;
    }

    public void setQcItemName(String qcItemName) {
        this.qcItemName = qcItemName;
    }

    public String getQcItemNo() {
        return qcItemNo;
    }

    public void setQcItemNo(String qcItemNo) {
        this.qcItemNo = qcItemNo;
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

    public String getQcType() {
        return qcType;
    }

    public void setQcType(String qcType) {
        this.qcType = qcType;
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

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }
}