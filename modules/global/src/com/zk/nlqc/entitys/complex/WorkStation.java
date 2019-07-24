package com.zk.nlqc.entitys.complex;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.zk.nlqc.entitys.base.QcArgs;
import com.zk.nlqc.enums.QcTypeEnum;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s %s|workStationNo,workStationName")
@Table(name = "NLQC_WORK_STATION")
@Entity(name = "nlqc_WorkStation")
public class WorkStation extends StandardEntity {
    private static final long serialVersionUID = -6465755325683951152L;

    @NotNull
    @Column(name = "WORK_STATION_NO", nullable = false, unique = true)
    protected String workStationNo;

    @Column(name = "WORK_STATION")
    protected String workStation;

    @NotNull
    @Column(name = "QCTYPE", nullable = false)
    protected String qctype;

    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)
    @OneToMany(mappedBy = "workStation")
    protected List<QcArgs> qcArgs;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QC_COURSE_ID")
    protected QcCourse qcCourse;

    @Column(name = "NOTE")
    protected String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public QcCourse getQcCourse() {
        return qcCourse;
    }

    public void setQcCourse(QcCourse qcCourse) {
        this.qcCourse = qcCourse;
    }

    public List<QcArgs> getQcArgs() {
        return qcArgs;
    }

    public void setQcArgs(List<QcArgs> qcArgs) {
        this.qcArgs = qcArgs;
    }

    public QcTypeEnum getQctype() {
        return qctype == null ? null : QcTypeEnum.fromId(qctype);
    }

    public void setQctype(QcTypeEnum qctype) {
        this.qctype = qctype == null ? null : qctype.getId();
    }

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }

    public String getWorkStationNo() {
        return workStationNo;
    }

    public void setWorkStationNo(String workStationNo) {
        this.workStationNo = workStationNo;
    }
}