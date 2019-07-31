package com.zk.nlqc.web.screens.qccourse;

import com.haulmont.cuba.core.global.EntityStates;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.zk.nlqc.entitys.complex.QcCourse;
import com.zk.nlqc.service.ToolsService;

import javax.inject.Inject;

@UiController("nlqc_QcCourse.edit")
@UiDescriptor("qc-course-edit.xml")
@EditedEntityContainer("qcCourseDc")
@LoadDataBeforeShow
public class QcCourseEdit extends StandardEditor<QcCourse> {
    @Inject
    private EntityStates entityStates;
    @Inject
    private TextField<String> qcCourseNoField;
    @Inject
    private ToolsService toolsService;

    /**
     * 填充编号
     * @param event
     */
    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        if(entityStates.isNew(getEditedEntity())){
            qcCourseNoField.setValue(toolsService.getNumberByClassAndDate("QcCourse" , "NLQC_QC_COURSE" , "yyMM" ,5 , false));
        }
        qcCourseNoField.setEditable(false);
    }
}