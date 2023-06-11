package com.myapp.springboot.learnjpaandhibarnate.course.springdatajpa;

import com.myapp.springboot.learnjpaandhibarnate.course.jpa.CourseJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        CourseJpa course = new CourseJpa(1,"Learn JPA","myapp");
        courseSpringDataJpaRepository.save(course);

        CourseJpa course2 = new CourseJpa(2,"Learn JPA2","myapp");
        courseSpringDataJpaRepository.save(course2);

        courseSpringDataJpaRepository.deleteById(1L);

        System.out.println(courseSpringDataJpaRepository.findById(2L));

        System.out.println(courseSpringDataJpaRepository.findAll());
        System.out.println(courseSpringDataJpaRepository.count());
        System.out.println(courseSpringDataJpaRepository.findByAuthor("myapp"));
        System.out.println(courseSpringDataJpaRepository.findByAuthor("me"));
        System.out.println(courseSpringDataJpaRepository.findByName("Learn JPA2"));
    }
}
