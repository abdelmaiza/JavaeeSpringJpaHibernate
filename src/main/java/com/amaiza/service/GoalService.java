package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GoalService {
    Goal save(Goal goal);

    List<Goal> findAllGoals();

    List<GoalReport> findAllGoalReports();
}
