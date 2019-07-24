package com.zk.nlqc.entitys.base;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|carModelNo,carModelName")
@Table(name = "NLQC_CAR_MODEL")
@Entity(name = "nlqc_CarModel")
public class CarModel extends StandardEntity {
    private static final long serialVersionUID = 8849911415591796800L;

    @NotNull
    @Column(name = "CAR_MODEL_NO", nullable = false, unique = true)
    protected String carModelNo;

    @NotNull
    @Column(name = "CAR_MODEL_NAME", nullable = false)
    protected String carModelName;

    @Column(name = "NOTE")
    protected String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }

    public String getCarModelNo() {
        return carModelNo;
    }

    public void setCarModelNo(String carModelNo) {
        this.carModelNo = carModelNo;
    }
}