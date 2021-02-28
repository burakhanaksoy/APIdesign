package io.theBMan.springBootStarter;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Lecture {
    private String name;
    private String description;
    private int studentNumber;

    public Lecture() {
    }

    public Lecture(String name, String description, int studentNumber) {
        this.name = name;
        this.description = description;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
