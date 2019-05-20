package com.amaiza.repository;

import com.amaiza.model.Exercise;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("exerciceRepository")
public class ExerciceRepositoryImpl implements ExerciceRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Exercise save(Exercise exercise) {
        entityManager.persist(exercise);
        entityManager.flush();
        return exercise;
    }
}
