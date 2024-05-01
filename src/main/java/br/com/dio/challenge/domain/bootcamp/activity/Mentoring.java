package br.com.dio.challenge.domain.bootcamp.activity;

import br.com.dio.challenge.domain.bootcamp.Bootcamp;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityType;

public class Mentoring extends Activity {
    public Mentoring(String title, String description, Bootcamp bootcamp) {
        super(title, description, bootcamp);
        this.activityType = ActivityType.MENTORING;
    }
}
