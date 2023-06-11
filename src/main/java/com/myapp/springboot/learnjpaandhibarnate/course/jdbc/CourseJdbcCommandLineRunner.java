package com.myapp.springboot.learnjpaandhibarnate.course.jdbc;

import com.myapp.springboot.learnjpaandhibarnate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;
    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(1,"Learn JPA","myapp");
        courseJdbcRepository.insert(course);

        course = new Course(2,"Learn JPA2","myapp");
        courseJdbcRepository.insert(course);

        courseJdbcRepository.deleteById(1L);

        System.out.println(courseJdbcRepository.findById(2L));
    }
}
