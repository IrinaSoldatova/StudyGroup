package org.example.controller;

import org.example.model.*;
import org.example.service.DataService;
import org.example.service.StudyGroupService;
import org.example.view.StudentView;
import org.example.view.StudyGroupView;
import org.example.view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final TeacherView teacherView = new TeacherView();
    private final StudyGroupView studyGroupView = new StudyGroupView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.TEACHER);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }

    public void getTeacher(){
        List<User> userList = service.getTeacher();
        for (User user: userList){
            teacherView.printOnConsole((Teacher) user);
        }
    }

    public void createStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = (Teacher) service.getUserById(Type.TEACHER, teacherId);
        List<Student> studentList = new ArrayList<>();
        for (Integer id : studentIds) {
            Student student = (Student) service.getUserById(Type.STUDENT, id);
            studentList.add(student);
        }
        studyGroupService.createStudyGroup(teacher, studentList);
    }

    public void getStudyGroup(){
        List<StudyGroup> studyGroups = studyGroupService.getAllStudyGroups();
        for (StudyGroup studyGroup : studyGroups) {
            studyGroupView.printOnConsole(studyGroup);
        }
    }
}