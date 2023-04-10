package org.example.Students.controller;

import org.example.Students.data.Student;
import org.example.Students.data.Teacher;
import org.example.Students.service.StudentGroupService;
import org.example.Students.service.TeacherGroupService;
import org.example.Students.service.StudentService;
import org.example.Students.service.TeacherService;
import org.example.Students.view.StudentView;
import org.example.Students.view.TeacherView;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService dataService = new TeacherService();
    private final TeacherGroupService teacherGroupService = new TeacherGroupService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void createStudentGroup(List<Teacher> teachers){
        teacherGroupService.createTeacherGroup(teachers);
        teacherView.sendOnConsoleUserGroup(teacherGroupService.getTeacherGroup());
    }

    public void getStudentInStudentGroup(String firstName, String secondName){
        Teacher teacher = teacherGroupService.getTeacherFromTeacherGroup(firstName, secondName);
        teacherView.sendOnConsole(Collections.singletonList(teacher));
    }

    public void getSortedListStudentFromStudentGroup(){
        List<Teacher> teachers = teacherGroupService.getSortedTeacherGroup();
        teacherView.sendOnConsole(teachers);
    }

    public void getSortedListByFIOStudentFromStudentGroup(){
        List<Teacher> teachers = teacherGroupService.getSortedByFIOTeacherGroup();
        teacherView.sendOnConsole(teachers);
    }
}