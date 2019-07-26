package com.zk.nlqc.entitys.base;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.zk.nlqc.enums.FrequencyUnitEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|unitName")
@Table(name = "NLQC_UNIT_FOR_FREQUENCY")
@Entity(name = "nlqc_UnitForFrequency")
public class UnitForFrequency extends StandardEntity {
    private static final long serialVersionUID = 1565995526637881931L;

    @NotNull
    @Column(name = "VALUE_", nullable = false)
    protected Integer value;

    @NotNull
    @Column(name = "UNIT", nullable = false)
    protected String unit;

    @NotNull
    @Column(name = "UNIT_NAME", nullable = false)
    protected String unitName;

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setUnit(FrequencyUnitEnum unit) {
        this.unit = unit == null ? null : unit.getId();
    }

    public FrequencyUnitEnum getUnit() {
        return unit == null ? null : FrequencyUnitEnum.fromId(unit);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getUnitName() {
        return unitName;
    }

}