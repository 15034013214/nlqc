package com.zk.nlqc.web.screens.qccourse;

import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.complex.QcCourse;

@UiController("nlqc_QcCourse.browse")
@UiDescriptor("qc-course-browse.xml")
@LookupComponent("qcCoursesTable")
@LoadDataBeforeShow
public class QcCourseBrowse extends StandardLookup<QcCourse> {
}