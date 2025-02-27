package org.example.CC3;

public class Student {

    private String name;
    private String lastName;

    public Student(final String name, final String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.name + " " + this.lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

}
