package br.com.dio.challenge.domain.bootcamp.activity;

import br.com.dio.challenge.domain.bootcamp.Bootcamp;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityLevel;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityType;

public abstract class Activity {
    private final String title;
    private final String description;
    protected ActivityLevel activityLevel;
    protected ActivityType activityType;
    protected int workload;


    public Activity(String title, String description, Bootcamp bootcamp) {
        this.title = title;
        this.description = description;
        bootcamp.addActivity(this);
    }

    @Override
    public String toString() {
        return "\t" + this.activityType.getTypeName() + "\n" +
                "\tTitle: " + title + "\n" +
                "\tDescription: " + description + "\n" +
                (this.activityLevel != null? "\tLevel: " + this.activityLevel.getLevelName() + "\n" : "") +
                (this.workload != 0 ? "\tWorkload: " + this.workload + " hrs": "");
    }
}
