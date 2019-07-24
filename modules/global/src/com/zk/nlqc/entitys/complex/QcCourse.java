package com.zk.nlqc.entitys.complex;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "NLQC_QC_COURSE")
@Entity(name = "nlqc_QcCourse")
public class QcCourse extends StandardEntity {
    private static final long serialVersionUID = -4629863270255005471L;

    @NotNull
    @Column(name = "QC_COURSE_NO", nullable = false, unique = true)
    protected String qcCourseNo;

    @Column(name = "QC_COURSE_NAME")
    protected String qcCourseName;

    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @OneToMany(mappedBy = "qcCourse")
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