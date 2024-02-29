package org.example.service;

import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private List<StudyGroup> studyGroups = new ArrayList<>();
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
        StudyGroup studyGroup = new StudyGroup(teacher, studentList);
        studyGroups.add(studyGroup);
        return studyGroup;
    }

    public List<StudyGroup> getAllStudyGroups(){
        return studyGroups;
    }
}
