package io.theBMan.springBootStarter.lecture;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Lecture {
    @Id
    private String name;
    private String description;
    private String teacher;

    public Lecture() {
    }

    public Lecture(String name, String description, String teacher) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
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
}
