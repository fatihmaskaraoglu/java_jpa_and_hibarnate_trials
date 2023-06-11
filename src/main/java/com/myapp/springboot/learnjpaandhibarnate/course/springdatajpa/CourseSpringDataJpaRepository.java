package com.myapp.springboot.learnjpaandhibarnate.course.springdatajpa;

import com.myapp.springboot.learnjpaandhibarnate.course.jpa.CourseJpa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<CourseJpa,Long> {

    List<CourseJpa> findByAuthor(String author);
    List<CourseJpa> findByName(String name);
}
