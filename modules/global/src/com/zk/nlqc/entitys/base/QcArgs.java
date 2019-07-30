package com.zk.nlqc.entitys.base;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;
import com.haulmont.cuba.core.entity.annotation.ConversionType;
import com.zk.nlqc.entitys.complex.WorkStation;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s %s|qcArgsCode,qcArgsType")
@Table(name = "NLQC_QC_ARGS")
@Entity(name = "nlqc_QcArgs")
public class QcArgs extends StandardEntity {
    private static final long serialVersionUID = 2989558551581437525L;

    @CaseConversion(type = ConversionType.LOWER)
    @NotNull
    @Column(name = "QC_ARGS_CODE", nullable = false)
    protected String qcArgsCode;

    @NotNull
    @Column(name = "QC_ARGS_TYPE", nullable = false)
    protected String qcArgsType;

    @Column(name = "QC_ARGS_NOTE")
    protected String qcArgsNote;

    @Column(name = "NOTE")
    protected String note;
    @JoinTable(name = "NLQC_WORK_STATION_QC_ARGS_LINK",
            joinColumns = @JoinColumn(name = "QC_ARGS_ID"),
            inverseJoinColumns = @JoinColumn(name = "WORK_STATION_ID"))
    @ManyToMany
    protected List<WorkStation> workStations;

    public List<WorkStation> getWorkStations() {
        return workStations;
    }

    public void setWorkStations(List<WorkStation> workStations) {
        this.workStations = workStations;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getQcArgsNote() {
        return qcArgsNote;
    }

    public void setQcArgsNote(String qcArgsNote) {
        this.qcArgsNote = qcArgsNote;
    }

    public String getQcArgsType() {
        return qcArgsType;
    }

    public void setQcArgsType(String qcArgsType) {
        this.qcArgsType = qcArgsType;
    }

    public String getQcArgsCode() {
        return qcArgsCode;
    }

    public void setQcArgsCode(String qcArgsCode) {
        this.qcArgsCode = qcArgsCode;
    }
}