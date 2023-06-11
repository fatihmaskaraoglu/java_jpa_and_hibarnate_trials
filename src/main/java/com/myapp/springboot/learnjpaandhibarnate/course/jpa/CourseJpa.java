package com.myapp.springboot.learnjpaandhibarnate.course.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Course")
public class CourseJpa {
    @Id
    private long id;
    //@Column(name = "name") no need bcs same name
    private String name;
    //@Column(name = "author") no need bcs same name
    private String author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public CourseJpa() {
    }

    public CourseJpa(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "CourseJPA{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
