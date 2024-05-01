package br.com.dio.challenge.domain.bootcamp.activity;

import br.com.dio.challenge.domain.bootcamp.Bootcamp;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityLevel;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityType;

public class ChallengeDesign extends Activity {
    public ChallengeDesign(String title, String description, ActivityLevel activityLevel, int workload, Bootcamp bootcamp) {
        super(title, description, bootcamp);
        this.activityLevel = activityLevel;
        this.activityType = ActivityType.CHALLENGE_DESIGN;
        this.workload = workload;
    }
}
