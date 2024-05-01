package br.com.dio.challenge.domain.bootcamp;

import br.com.dio.challenge.domain.bootcamp.activity.Activity;
import br.com.dio.challenge.domain.bootcamp.dev.Dev;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Set<Dev> devs = new HashSet<>();
    private Set<Activity> activities = new LinkedHashSet<>();

    public Bootcamp(String name, String description, LocalDate startDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = startDate.plusDays(45);

    }

    public void addDev(Dev dev) {
        this.devs.add(dev);
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public void showBootcampInfo() {
        System.out.println(this.name);
        System.out.println(this.description);
        System.out.println("Activities: \n"
                + String.valueOf(this.activities)
                .replaceAll(",", "\n\n")
                .replaceAll("\\[", "")
                .replaceAll("]", ""));
    }
}
