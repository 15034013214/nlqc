package com.zk.nlqc.entitys.complex;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.zk.nlqc.entitys.base.Device;
import com.zk.nlqc.entitys.base.Frequency;
import com.zk.nlqc.entitys.base.Material;
import com.zk.nlqc.entitys.base.QcArgs;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NamePattern("%s %s|qcItemNo,qcItemName")
@Table(name = "NLQC_QC_ITEM")
@Entity(name = "nlqc_QcItem")
public class QcItem extends StandardEntity {
    private static final long serialVersionUID = 657376788550249256L;

    @NotNull
    @Column(name = "QC_ITEM_NO", nullable = false)
    protected String qcItemNo;

    @NotNull
    @Column(name = "QC_ITEM_NAME", nullable = false)
    protected String qcItemName;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QC_ARGS_ID")
    protected QcArgs qcArgs;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEVICE_ID")
    protected Device device;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MATEIAL_ID")
    protected Material mateial;

    @Column(name = "UNIT")
    protected String unit;

    @Column(name = "NORM_VALUE")
    protected BigDecimal normValue;

    @Column(name = "UP_VALUE")
    protected BigDecimal upValue;

    @Column(name = "BELOW_VALUE")
    protected BigDecimal belowValue;

    @Column(name = "IS_FIRST_QC")
    protected Boolean isFirstQc;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FIRST_QC_FREQUENCY_ID")
    protected Frequency firstQcFrequency;

    @Column(name = "IS_INITIATIVE_QC")
    protected Boolean isInitiativeQc;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INITIATIVE_QC_FREQUENCY_ID")
    protected Frequency initiativeQcFrequency;

    @Column(name = "IS_FINALLY_QC")
    protected Boolean isFinallyQc;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FINALLY_QC_FREQUENCY_ID")
    protected Frequency finallyQcFrequency;

    @Column(name = "IS_ROUNDS_QC")
    protected Boolean isRoundsQc;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROUNDS_QC_FREQUENCY_ID")
    protected Frequency roundsQcFrequency;

    @Column(name = "IS_CONTROL_ITEM")
    protected Boolean isControlItem;

    @Column(name = "PICTURE")
    protected Long picture;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QC_FLOW_ID")
    protected QcFlow qcFlow;

    public QcFlow getQcFlow() {
        return qcFlow;
    }

    public void setQcFlow(QcFlow qcFlow) {
        this.qcFlow = qcFlow;
    }

    public Long getPicture() {
        return picture;
    }

    public void setPicture(Long picture) {
        this.picture = picture;
    }

    public Boolean getIsControlItem() {
        return isControlItem;
    }

    public void setIsControlItem(Boolean isControlItem) {
        this.isControlItem = isControlItem;
    }

    public Frequency getRoundsQcFrequency() {
        return roundsQcFrequency;
    }

    public void setRoundsQcFrequency(Frequency roundsQcFrequency) {
        this.roundsQcFrequency = roundsQcFrequency;
    }

    public Boolean getIsRoundsQc() {
        return isRoundsQc;
    }

    public void setIsRoundsQc(Boolean isRoundsQc) {
        this.isRoundsQc = isRoundsQc;
    }

    public Frequency getFinallyQcFrequency() {
        return finallyQcFrequency;
    }

    public void setFinallyQcFrequency(Frequency finallyQcFrequency) {
        this.finallyQcFrequency = finallyQcFrequency;
    }

    public Boolean getIsFinallyQc() {
        return isFinallyQc;
    }

    public void setIsFinallyQc(Boolean isFinallyQc) {
        this.isFinallyQc = isFinallyQc;
    }

    public Frequency getInitiativeQcFrequency() {
        return initiativeQcFrequency;
    }

    public void setInitiativeQcFrequency(Frequency initiativeQcFrequency) {
        this.initiativeQcFrequency = initiativeQcFrequency;
    }

    public Boolean getIsInitiativeQc() {
        return isInitiativeQc;
    }

    public void setIsInitiativeQc(Boolean isInitiativeQc) {
        this.isInitiativeQc = isInitiativeQc;
    }

    public Frequency getFirstQcFrequency() {
        return firstQcFrequency;
    }

    public void setFirstQcFrequency(Frequency firstQcFrequency) {
        this.firstQcFrequency = firstQcFrequency;
    }

    public Boolean getIsFirstQc() {
        return isFirstQc;
    }

    public void setIsFirstQc(Boolean isFirstQc) {
        this.isFirstQc = isFirstQc;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Material getMateial() {
        return mateial;
    }

    public void setMateial(Material mateial) {
        this.mateial = mateial;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public QcArgs getQcArgs() {
        return qcArgs;
    }

    public void setQcArgs(QcArgs qcArgs) {
        this.qcArgs = qcArgs;
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
}