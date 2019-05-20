package com.amaiza.repository;

import com.amaiza.model.Goal;
import com.amaiza.model.GoalReport;

import java.util.List;

public interface GoalRepository {
    Goal save(Goal goal);

    List<Goal> findAll();

    List<GoalReport> findAllGoalReports();
}
