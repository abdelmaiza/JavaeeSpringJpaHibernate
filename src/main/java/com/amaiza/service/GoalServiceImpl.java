package com.amaiza.service;

import com.amaiza.model.Goal;
import com.amaiza.model.GoalReport;
import com.amaiza.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalRepository goalRepository;

    @Transactional
    public Goal save(Goal goal) {
        return goalRepository.save(goal);
    }

    public List<Goal> findAllGoals() {
        return goalRepository.findAll();
    }

    public List<GoalReport> findAllGoalReports() {
        return goalRepository.findAllGoalReports();
    }
}
