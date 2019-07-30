package com.zk.nlqc.entitys.base;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@NamePattern("%s|showText")
@Table(name = "NLQC_FREQUENCY")
@Entity(name = "nlqc_Frequency")
public class Frequency extends StandardEntity {
    private static final long serialVersionUID = 5331657026245938034L;

    @Column(name = "FREQUENCY_NO")
    protected String frequencyNo;

    @Column(name = "QUANTITY")
    protected Integer quantity;

    @OnDeleteInverse(DeletePolicy.DENY)
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UNIT_ID")
    protected UnitForFrequency unit;

    @Column(name = "IS_INFINITY_BIG")
    protected Boolean isInfinityBig;

    @Column(name = "SHOW_TEXT")
    protected String showText;

    @Column(name = "NOTE")
    protected String note;

    public String getFrequencyNo() {
        return frequencyNo;
    }

    public void setFrequencyNo(String frequencyNo) {
        this.frequencyNo = frequencyNo;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setUnit(UnitForFrequency unit) {
        this.unit = unit;
    }

    public UnitForFrequency getUnit() {
        return unit;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getShowText() {
        return showText;
    }

    public void setShowText(String showText) {
        this.showText = showText;
    }

    public Boolean getIsInfinityBig() {
        return isInfinityBig;
    }

    public void setIsInfinityBig(Boolean isInfinityBig) {
        this.isInfinityBig = isInfinityBig;
    }

}