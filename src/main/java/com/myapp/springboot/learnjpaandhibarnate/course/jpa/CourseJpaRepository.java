package com.myapp.springboot.learnjpaandhibarnate.course.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(CourseJpa course){
        entityManager.merge(course);
    }

    public CourseJpa findById(Long id){
        return entityManager.find(CourseJpa.class, id);
    }

    public void deleteById(Long id){
        CourseJpa course =  entityManager.find(CourseJpa.class, id);
        entityManager.remove(course);
    }
}
