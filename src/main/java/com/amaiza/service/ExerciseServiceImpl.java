package com.amaiza.service;

import java.util.ArrayList;
import java.util.List;

import com.amaiza.model.Exercise;
import com.amaiza.repository.ExerciceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amaiza.model.Activity;
import org.springframework.transaction.annotation.Transactional;


@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	@Autowired
	private ExerciceRepository exerciceReository;

	public List<Activity> findAllActivities() {
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}

	@Transactional
	public Exercise save(Exercise exercise) {
		exercise = exerciceReository.save(exercise);
		return exercise;
	}

}
