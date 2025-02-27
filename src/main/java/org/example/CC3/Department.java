package org.example.CC3;

import java.util.HashMap;
import java.util.Map;

public class Department {

    private Map<Student, Integer> studentsMarks = new HashMap<Student,Integer>();
    
    public void addStudent(final Student student, final int mark) {
        for (Map.Entry<Student, Integer> studentMark : studentsMarks.entrySet()) {
            if (studentMark.getKey().getLastName().equals(student.getLastName())) {
                studentsMarks.remove(studentMark.getKey());
                break;
            }   
        }
        studentsMarks.put(student, mark);
    }

    public void printStudentsMarks() {
        for (Map.Entry<Student, Integer> studentMark : studentsMarks.entrySet()) {
            System.out.println(studentMark.getKey().getFullName() + " - " + studentMark.getValue()); 
        }
    }

    public int getSizeStudentsMarks() {
        return this.studentsMarks.size();
    }

}
