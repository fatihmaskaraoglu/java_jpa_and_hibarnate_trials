package com.myapp.springboot.learnjpaandhibarnate.course.springdatajpa;

import com.myapp.springboot.learnjpaandhibarnate.course.jpa.CourseJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<CourseJpa,Long> {
}
