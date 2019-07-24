package com.zk.nlqc.entitys.base;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|showText")
@Table(name = "NLQC_FREQUENCY")
@Entity(name = "nlqc_Frequency")
public class Frequency extends StandardEntity {
    private static final long serialVersionUID = 5331657026245938034L;

    @Column(name = "QUANTITY")
    protected String quantity;

    @Column(name = "UNIT")
    protected String unit;

    @Column(name = "IS_INFINITY_BIG")
    protected Boolean isInfinityBig;

    @Column(name = "SHOW_TEXT")
    protected String showText;

    @Column(name = "NOTE")
    protected String note;

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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}