package org.example.CC3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CC3Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldAddAStudentToTheDepartament() {
        final Department departament = new Department();
        final Student student = new Student("Luis", "Cifuentes");

        departament.addStudent(student, 95);
        departament.printStudentsMarks();
        
        assertTrue(departament.getSizeStudentsMarks() == 1);
    }

    @Test
    void shouldReplaceAStudentToTheDepartament() {

        final Department departament = new Department();
        final Student student1 = new Student("Luis", "Cifuentes");
        final Student student2 = new Student("Daniel", "Cifuentes");

        departament.addStudent(student1, 95);
        departament.printStudentsMarks();
        departament.addStudent(student2, 85);
        departament.printStudentsMarks();
        
        assertTrue(departament.getSizeStudentsMarks() == 1);
    }    

}
