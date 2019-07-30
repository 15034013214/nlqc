package com.zk.nlqc.entitys.record;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.zk.nlqc.entitys.base.Frequency;
import com.zk.nlqc.enums.QcResult;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s|qcRecordBillItem")
@Table(name = "NLQC_QC_RECORD_BILLS_ITEM")
@Entity(name = "nlqc_QcRecordBillsItem")
public class QcRecordBillsItem extends StandardEntity {
    private static final long serialVersionUID = 8937351850428484099L;

    @Column(name = "QC_RECORD_BILL_ITEM")
    protected String qcRecordBillItem;

    @Column(name = "QC_ITEM_NO")
    protected String qcItemNo;

    @Column(name = "QC_ARGS_NO")
    protected String qcArgsNo;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FIRST_HZ_ID")
    protected Frequency firstHz;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INITIATIVE_HZ_ID")
    protected Frequency initiativeHz;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LAST_HZ_ID")
    protected Frequency lastHz;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CIRCLE_HZ_ID")
    protected Frequency circleHz;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "QC_TIME")
    protected Date qcTime;

    @Column(name = "IS_CONTROL")
    protected Boolean isControl;

    @Column(name = "QC_RESULT")
    protected String qcResult;

    @Column(name = "NOTE")
    protected String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QC_RECORD_BILLS_ID")
    protected QcRecordBills qcRecordBills;

    public void setQcResult(QcResult qcResult) {
        this.qcResult = qcResult == null ? null : qcResult.getId();
    }

    public QcResult getQcResult() {
        return qcResult == null ? null : QcResult.fromId(qcResult);
    }

    public QcRecordBills getQcRecordBills() {
        return qcRecordBills;
    }

    public void setQcRecordBills(QcRecordBills qcRecordBills) {
        this.qcRecordBills = qcRecordBills;
    }

    public void setNormValue(Long normValue) {
        this.normValue = normValue;
    }

    public Long getNormValue() {
        return normValue;
    }

    public void setUpValue(Long upValue) {
        this.upValue = upValue;
    }

    public Long getUpValue() {
        return upValue;
    }

    public void setDownValue(Long downValue) {
        this.downValue = downValue;
    }

    public Long getDownValue() {
        return downValue;
    }

    public void setActualValue(Long actualValue) {
        this.actualValue = actualValue;
    }

    public Long getActualValue() {
        return actualValue;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getIsControl() {
        return isControl;
    }

    public void setIsControl(Boolean isControl) {
        this.isControl = isControl;
    }

    public Date getQcTime() {
        return qcTime;
    }

    public void setQcTime(Date qcTime) {
        this.qcTime = qcTime;
    }

    public Frequency getCircleHz() {
        return circleHz;
    }

    public void setCircleHz(Frequency circleHz) {
        this.circleHz = circleHz;
    }

    public Frequency getLastHz() {
        return lastHz;
    }

    public void setLastHz(Frequency lastHz) {
        this.lastHz = lastHz;
    }

    public Frequency getInitiativeHz() {
        return initiativeHz;
    }

    public void setInitiativeHz(Frequency initiativeHz) {
        this.initiativeHz = initiativeHz;
    }

    public Frequency getFirstHz() {
        return firstHz;
    }

    public void setFirstHz(Frequency firstHz) {
        this.firstHz = firstHz;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public String getQcArgsNo() {
        return qcArgsNo;
    }

    public void setQcArgsNo(String qcArgsNo) {
        this.qcArgsNo = qcArgsNo;
    }

    public String getQcItemNo() {
        return qcItemNo;
    }

    public void setQcItemNo(String qcItemNo) {
        this.qcItemNo = qcItemNo;
    }

    public String getQcRecordBillItem() {
        return qcRecordBillItem;
    }

    public void setQcRecordBillItem(String qcRecordBillItem) {
        this.qcRecordBillItem = qcRecordBillItem;
    }
}