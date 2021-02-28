package io.theBMan.springBootStarter.student;

import io.theBMan.springBootStarter.lecture.Lecture;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
    @Id
    private String id;
    private String name;
    private Double gpa;
    @ManyToOne
    private Lecture lecture;

    public Student() {
    }

    public Student(String id, String name, Double gpa, String lectureName) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.lecture = new Lecture(lectureName,"","");
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
}
