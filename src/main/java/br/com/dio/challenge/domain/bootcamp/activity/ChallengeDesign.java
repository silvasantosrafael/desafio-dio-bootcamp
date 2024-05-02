package br.com.dio.challenge.domain.bootcamp.activity;

import br.com.dio.challenge.domain.bootcamp.Bootcamp;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityLevel;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityType;

public class ChallengeDesign extends Activity {
    public ChallengeDesign(String title, String description, ActivityLevel activityLevel, int workload, Bootcamp bootcamp) {
        super(title, description, activityLevel, workload, bootcamp);
        this.activityType = ActivityType.CHALLENGE_DESIGN;
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP + (this.workload + 10d);
    }
}
