package br.com.dio.challenge.domain.bootcamp;

import br.com.dio.challenge.domain.bootcamp.activity.Content;
import br.com.dio.challenge.domain.bootcamp.dev.Dev;
import br.com.dio.challenge.domain.bootcamp.utils.DateTimeFormatUtils;
import lombok.Getter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private final String name;
    private final String description;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final Set<Dev> devs = new HashSet<>();
    @Getter
    private final Set<Content> contents = new LinkedHashSet<>();

    public Bootcamp(String name, String description, LocalDate startDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = startDate.plusDays(45);

    }

    public void addDev(Dev dev) {
        this.devs.add(dev);
    }

    public void addContent(Content content) {
        this.contents.add(content);
    }

    public void showDevs() {
        System.out.println("\nDevs:");
        this.devs.forEach(dev -> System.out.println(dev + "\n"));
    }

    public void showBootcampInfo() {
        System.out.println("\n" + this.name);
        System.out.println(this.description);
        System.out.println("Start date: " + DateTimeFormatUtils.dateFormatted(this.startDate, "Date")
                + " | " + "End date: " + DateTimeFormatUtils.dateFormatted(this.endDate, "Date"));
        System.out.println("Activities:");
        this.contents.forEach(content -> System.out.println(content + "\n"));
    }

}
