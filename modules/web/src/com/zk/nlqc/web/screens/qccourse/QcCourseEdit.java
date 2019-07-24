package com.zk.nlqc.web.screens.qccourse;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.complex.QcCourse;

@UiController("nlqc_QcCourse.edit")
@UiDescriptor("qc-course-edit.xml")
@EditedEntityContainer("qcCourseDc")
@LoadDataBeforeShow
public class QcCourseEdit extends StandardEditor<QcCourse> {
}