package com.myapp.springboot.learnjpaandhibarnate.course.jpa;

import com.myapp.springboot.learnjpaandhibarnate.course.jdbc.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(CourseJPA course){
        entityManager.merge(course);
    }

    public CourseJPA findById(Long id){
        return entityManager.find(CourseJPA.class, id);
    }

    public void deleteById(Long id){
        CourseJPA course =  entityManager.find(CourseJPA.class, id);
        entityManager.remove(course);
    }
}
