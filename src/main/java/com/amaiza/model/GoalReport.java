package com.amaiza.model;

public class GoalReport {
    private int goalMinutes;
    private int exerciceMinutes;
    private String exerciceActivity;

    public GoalReport(int goalMinutes, int exerciceMinutes, String exerciceActivity) {
        this.goalMinutes = goalMinutes;
        this.exerciceMinutes = exerciceMinutes;
        this.exerciceActivity = exerciceActivity;
    }

    public int getGoalMinutes() {
        return goalMinutes;
    }

    public void setGoalMinutes(int goalMinutes) {
        this.goalMinutes = goalMinutes;
    }

    public int getExerciceMinutes() {
        return exerciceMinutes;
    }

    public void setExerciceMinutes(int exerciceMinutes) {
        this.exerciceMinutes = exerciceMinutes;
    }

    public String getExerciceActivity() {
        return exerciceActivity;
    }

    public void setExerciceActivity(String exerciceActivity) {
        this.exerciceActivity = exerciceActivity;
    }
}
