package com.zk.nlqc.entitys.complex;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s %s|qcCourseNo,qcCourseName")
@Table(name = "NLQC_QC_COURSE")
@Entity(name = "nlqc_QcCourse")
public class QcCourse extends StandardEntity {
    private static final long serialVersionUID = -4629863270255005471L;

    @NotNull
    @Column(name = "QC_COURSE_NO", nullable = false, unique = true)
    protected String qcCourseNo;

    @Column(name = "QC_COURSE_NAME")
    protected String qcCourseName;

    @JoinTable(name = "NLQC_QC_COURSE_WORK_STATION_LINK", joinColumns = @JoinColumn(name = "QC_COURSE_ID"), inverseJoinColumns = @JoinColumn(name = "WORK_STATION_ID"))
    @ManyToMany
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    protected List<WorkStation> workStation;

    @Column(name = "NOTE")
    protected String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<WorkStation> getWorkStation() {
        return workStation;
    }

    public void setWorkStation(List<WorkStation> workStation) {
        this.workStation = workStation;
    }

    public String getQcCourseName() {
        return qcCourseName;
    }

    public void setQcCourseName(String qcCourseName) {
        this.qcCourseName = qcCourseName;
    }

    public String getQcCourseNo() {
        return qcCourseNo;
    }

    public void setQcCourseNo(String qcCourseNo) {
        this.qcCourseNo = qcCourseNo;
    }
}