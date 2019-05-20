package com.pluralsight.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "exercices")
public class Exercise {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EXERCICE_ID")
	private Long id;

	@Range(min = 1, max = 120)
	@Column(name = "MINUTES")
	private int minutes;

	@ManyToOne()
	private Goal goal;
	
	@NotNull
	@Column(name = "ACTIVITY")
	private String activity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
