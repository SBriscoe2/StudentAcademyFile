package com.ShaBris.AcademyFile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDirectoryTest {

    private StudentDirectory directory;

    @BeforeEach
    void init() {
        directory = new StudentDirectory();
    }

    @Test
    @DisplayName("Check new student details has been entered into directory")


    void addNewStudentTest() {
        directory.addNewStudent("Howlett", "James", "18/06/1880",
                "Male", "Wolverine", "Hero");
        List<StudentBase> student = directory.getAllStudents();
        assertEquals(1, student.size());
    }

    @Test
    @DisplayName("Check details have been added correctly")
    void checkEnteredStudentDetails() {
        directory.addNewStudent("Howlett", "James", "18/06/1880",
                "Male", "Wolverine", "Hero");
        List<StudentBase> studentHowell = directory.getAllStudents();
        StudentBase student = studentHowell.get(0);

        assertAll(
                () -> assertEquals("Howlett", student.getStudentLastName()),
                () -> assertEquals("James", student.getStudentFirstName()),
                () -> assertEquals("Male", student.getGender())
        );
    }
}