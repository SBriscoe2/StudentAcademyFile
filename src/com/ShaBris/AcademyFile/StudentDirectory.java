package com.ShaBris.AcademyFile;

import java.util.ArrayList;
import java.util.List;

public class StudentDirectory {

    private List<StudentBase> studentBase;

    public StudentDirectory() {
        this.studentBase = new ArrayList<>();
    }

    public void addNewStudent(String studentLastName, String studentFirstName, String studentdob,
                              String studentGender, String studentAlias,  String studentPartnerType) {
        StudentBase student = new StudentBase(studentLastName, studentFirstName,studentdob,
                studentGender, studentAlias, studentPartnerType);
        studentBase.add(student);
    }

    public List<StudentBase> getAllStudents() {
        return this.studentBase;
    }
}