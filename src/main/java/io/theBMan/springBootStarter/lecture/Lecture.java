package io.theBMan.springBootStarter.lecture;

import io.theBMan.springBootStarter.student.Student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lecture {
    @Id
    private String name;
    private String description;
    private String teacher;
//    private Student student;

    public Lecture() {
    }

    public Lecture(String name, String description, String teacher, Student student) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
//        this.student = student;
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

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }
}
