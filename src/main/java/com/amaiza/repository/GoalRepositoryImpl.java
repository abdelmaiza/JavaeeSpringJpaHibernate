package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Goal save(Goal goal) {
        entityManager.persist(goal);
        entityManager.flush();
        return goal;
    }

    public List<Goal> findAll() {
        Query select_g_from_goal_g = entityManager.createQuery("select g from Goal g");
        List<Goal> goals = select_g_from_goal_g.getResultList();
        return goals;
    }

    public List<GoalReport> findAllGoalReports() {
        Query query = entityManager.createQuery("Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) " + "from Goal g, Exercise e where g.id = e.goal.id");
        return query.getResultList();
    }
}
