package br.com.dio.challenge.domain.bootcamp.activity;

import br.com.dio.challenge.domain.bootcamp.Bootcamp;
import br.com.dio.challenge.domain.bootcamp.utils.DateTimeFormatUtils;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityType;

import java.time.Duration;
import java.time.LocalDateTime;

public class Mentoring extends Content {
    private final LocalDateTime mentoringDate;
    private final Duration mentoringDuration;


    public Mentoring(String title, String description, LocalDateTime mentoringDate, Duration mentoringDuration, Bootcamp bootcamp) {
        super(title, description, bootcamp);
        this.activityType = ActivityType.MENTORING;
        this.mentoringDate = mentoringDate;
        this.mentoringDuration = mentoringDuration;
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 10d;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tDate: " + DateTimeFormatUtils.dateFormatted(this.mentoringDate, "Date") + "\n" +
                "\tTime: " + DateTimeFormatUtils.dateFormatted(this.mentoringDate, "Time") + "\n" +
                "\tDuration: " + DateTimeFormatUtils.timeFormatted(mentoringDuration);
    }
}
