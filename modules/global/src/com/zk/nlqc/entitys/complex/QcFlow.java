package com.zk.nlqc.entitys.complex;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.zk.nlqc.entitys.base.CarModel;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s %s %s|carModel,qcCourse,workStation")
@Table(name = "NLQC_QC_FLOW")
@Entity(name = "nlqc_QcFlow")
public class QcFlow extends StandardEntity {
    private static final long serialVersionUID = -3704377907276222730L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_MODEL_ID")
    protected CarModel carModel;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QC_COURSE_ID")
    protected QcCourse qcCourse;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORK_STATION_ID")
    protected WorkStation workStation;

    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @OneToMany(mappedBy = "qcFlow")
    protected List<QcItem> qcItem;

    public List<QcItem> getQcItem() {
        return qcItem;
    }

    public void setQcItem(List<QcItem> qcItem) {
        this.qcItem = qcItem;
    }

    public WorkStation getWorkStation() {
        return workStation;
    }

    public void setWorkStation(WorkStation workStation) {
        this.workStation = workStation;
    }

    public void setQcCourse(QcCourse qcCourse) {
        this.qcCourse = qcCourse;
    }

    public QcCourse getQcCourse() {
        return qcCourse;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }
}