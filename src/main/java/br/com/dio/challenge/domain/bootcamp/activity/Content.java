package br.com.dio.challenge.domain.bootcamp.activity;

import br.com.dio.challenge.domain.bootcamp.Bootcamp;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityType;

public abstract class Content {
    protected static final double DEFAULT_XP = 10d;
    protected final String title;
    protected final String description;
    protected ActivityType activityType;

    public abstract double calculateXp();

    public Content(String title, String description, Bootcamp bootcamp) {
        this.title = title;
        this.description = description;
        bootcamp.addContent(this);
    }

    @Override
    public String toString() {
        return "\t" + this.activityType.getTypeName() + "\n" +
                "\tTitle: " + this.title + "\n" +
                "\tDescription: " + this.description + "\n";
    }
}
