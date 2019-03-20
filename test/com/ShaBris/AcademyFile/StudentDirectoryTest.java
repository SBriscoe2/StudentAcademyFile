package com.ShaBris.AcademyFile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDirectoryTest {

    private StudentDirectory directory;

    @BeforeEach
    void init() {
        directory = new StudentDirectory();
    }

    @Nested
    @DisplayName("New student details")

    class userEntry {
        @Test
        @DisplayName("Check new student details has been entered into directory")

        void addNewStudentTest () {
            directory.addNewStudent("Howlett", "James", "18/06/1880",
                    "Male", "Wolverine", "Hero");
            List<StudentBase> student = directory.getAllStudents();
            assertEquals(1, student.size());
        }

        @Test
        @DisplayName("Check details have been added correctly")
        void checkEnteredStudentDetails () {
            directory.addNewStudent("howlett", "james", "18/06/1880",
                    "male", "wolverine", "hero");
            List<StudentBase> studentHowell = directory.getAllStudents();
            StudentBase student = studentHowell.get(0);

            assertAll(
                    () -> assertEquals("howlett", student.getStudentLastName()),
                    () -> assertEquals("james", student.getStudentFirstName()),
                    () -> assertEquals("male", student.getGender())
            );
        }
    }

    @Test
    @DisplayName("Correctly show the details for a number of students")

    void viewAllstudentsTest () {
        directory.addNewStudent("Howlett", "James", "18/06/1880",
                "Male", "Wolverine", "Hero");
        directory.addNewStudent("Parker", "Peter", "16/04/2000",
                "Male", "Spiderman", "Hero");
        directory.addNewStudent("Grayson", "Dick", "25/12/2005",
                "Male", "Robin", "Sidekick");
        List<StudentBase> students = directory.getAllStudents();
        assertEquals(3, directory.getAllStudents().size());
    }
}