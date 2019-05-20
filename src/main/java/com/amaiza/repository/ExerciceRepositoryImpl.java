package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("exerciceRepository")
public class ExerciceReositoryImpl implements ExerciceReository {

    @PersistenceContext
    private EntityManager entityManager;

    public Exercise save(Exercise exercise) {
        entityManager.persist(exercise);
        entityManager.flush();
        return exercise;
    }
}
