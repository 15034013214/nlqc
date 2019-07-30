package com.zk.nlqc.entitys.complex;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.zk.nlqc.entitys.base.Device;
import com.zk.nlqc.entitys.base.QcArgs;
import com.zk.nlqc.enums.QcTypeEnum;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s %s|workStationNo,workStation")
@Table(name = "NLQC_WORK_STATION")
@Entity(name = "nlqc_WorkStation")
public class WorkStation extends StandardEntity {
    private static final long serialVersionUID = -6465755325683951152L;

    @NotNull
    @Column(name = "WORK_STATION_NO", nullable = false)
    protected String workStationNo;

    @Column(name = "WORK_STATION")
    protected String workStation;

    @NotNull
    @Column(name = "QCTYPE", nullable = false)
    protected String qctype;

    @JoinTable(name = "NLQC_WORK_STATION_QC_ARGS_LINK", joinColumns = @JoinColumn(name = "WORK_STATION_ID"), inverseJoinColumns = @JoinColumn(name = "QC_ARGS_ID"))
    @ManyToMany
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    protected List<QcArgs> qcArgs;

    @JoinTable(name = "NLQC_WORK_STATION_DEVICE_LINK", joinColumns = @JoinColumn(name = "WORK_STATION_ID"), inverseJoinColumns = @JoinColumn(name = "DEVICE_ID"))
    @ManyToMany
    protected List<Device> device;

    @Column(name = "NOTE")
    protected String note;
    @JoinTable(name = "NLQC_QC_COURSE_WORK_STATION_LINK",
            joinColumns = @JoinColumn(name = "WORK_STATION_ID"),
            inverseJoinColumns = @JoinColumn(name = "QC_COURSE_ID"))
    @ManyToMany
    protected List<QcCourse> qcCourses;

    public List<QcCourse> getQcCourses() {
        return qcCourses;
    }

    public void setQcCourses(List<QcCourse> qcCourses) {
        this.qcCourses = qcCourses;
    }

    public List<Device> getDevice() {
        return device;
    }

    public void setDevice(List<Device> device) {
        this.device = device;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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