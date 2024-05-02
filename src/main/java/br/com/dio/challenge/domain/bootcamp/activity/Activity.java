package br.com.dio.challenge.domain.bootcamp.activity;

import br.com.dio.challenge.domain.bootcamp.Bootcamp;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityLevel;

public abstract class Activity extends Content {
    protected int workload;
    protected ActivityLevel activityLevel;


    public Activity(String title, String description, ActivityLevel activityLevel, int workload, Bootcamp bootcamp) {
        super(title, description, bootcamp);
        this.workload = workload;
        this.activityLevel = activityLevel;
    }

    @Override
    public String toString() {
        return super.toString() +
                (this.activityLevel != null ? "\tLevel: " + this.activityLevel.getLevelName() + "\n" : "") +
                (this.workload != 0 ? "\tWorkload: " + this.workload + " hrs" : "");
    }
}
