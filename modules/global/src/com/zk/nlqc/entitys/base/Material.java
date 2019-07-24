package com.zk.nlqc.entitys.base;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|materialNo,materialName")
@Table(name = "NLQC_MATERIAL")
@Entity(name = "nlqc_Material")
public class Material extends StandardEntity {
    private static final long serialVersionUID = 6719917886273853694L;

    @NotNull
    @Column(name = "MATERIAL_NO", nullable = false, unique = true)
    protected String materialNo;

    @NotNull
    @Column(name = "MATERIAL_NAME", nullable = false, unique = true)
    protected String materialName;

    @Column(name = "NOTE")
    protected String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo;
    }
}