package com.amaiza.service;

import com.amaiza.model.Goal;
import com.amaiza.model.GoalReport;

import java.util.List;

public interface GoalService {
    Goal save(Goal goal);

    List<Goal> findAllGoals();

    List<GoalReport> findAllGoalReports();
}
