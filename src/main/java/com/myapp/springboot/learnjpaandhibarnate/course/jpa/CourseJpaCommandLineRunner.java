package com.myapp.springboot.learnjpaandhibarnate.course.jpa;

import com.myapp.springboot.learnjpaandhibarnate.course.jdbc.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner  implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJpaRepository;


    @Override
    public void run(String... args) throws Exception {
        CourseJPA course = new CourseJPA(1,"Learn JPA","myapp");
        courseJpaRepository.insert(course);

        course = new CourseJPA(2,"Learn JPA2","myapp");
        courseJpaRepository.insert(course);

        courseJpaRepository.deleteById(1L);

        System.out.println(courseJpaRepository.findById(2L));
    }
}
