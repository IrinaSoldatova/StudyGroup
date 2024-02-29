package org.example;


import org.example.controller.Controller;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("first name01", "second name01","last name01","date of birth");
        controller.createStudent("first name02", "second name02","last name02","date of birth");
        controller.createStudent("first name03", "second name03","last name03","date of birth");
        controller.createStudent("first name04", "second name04","last name04","date of birth");
        controller.createTeacher("first name1","second name1","last name1", "date of birth");
        controller.createTeacher("first name2","second name2","last name2", "date of birth");
        controller.createTeacher("first name3","second name3","last name3", "date of birth");

        controller.getAllStudent();
        System.out.println();

        controller.getTeacher();
        System.out.println();

        controller.createStudyGroup(1, List.of(1,3));
        controller.createStudyGroup(3, List.of(2,3,4));
        controller.createStudyGroup(2, List.of(1,2,3));
        controller.getStudyGroup();
    }
}
