package com.amaiza.service;

import java.util.List;

import com.amaiza.model.Activity;
import com.amaiza.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);
}