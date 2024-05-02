package br.com.dio.challenge.domain.bootcamp.dev;

import br.com.dio.challenge.domain.bootcamp.Bootcamp;
import br.com.dio.challenge.domain.bootcamp.activity.Content;

import java.util.HashSet;
import java.util.Set;

public class Dev {
    private final String name;
    private final String username;
    private final Set<Content> contentsRegistered = new HashSet<>();
    private final Set<Content> contentsCompleted = new HashSet<>();
    private double totalXp;


    public Dev(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public void registerBootcamp(Bootcamp bootcamp) {
        this.contentsRegistered.addAll(bootcamp.getContents());
        bootcamp.addDev(this);
    }

    public void progress(Content content) {
        if (this.contentsRegistered.contains(content)) {
            this.contentsCompleted.add(content);
            this.contentsRegistered.remove(content);
            this.totalXp = calculateTotalXp();
        } else {
            System.err.println("You are not enrolled in any content!");
        }
    }

    private double calculateTotalXp() {
        return this.contentsCompleted.stream()
                .mapToDouble(Content::calculateXp)
                .sum();
    }

    public void showDevInfo() {
        System.out.println("\nName: " + this.name + "\nUsername: " + this.username);
        System.out.println("Contents Registered:");
        this.contentsRegistered.forEach(content -> System.out.println(content + "\n"));
        System.out.println("Contents Completed:");
        this.contentsCompleted.forEach(content -> System.out.println(content + "\n"));
        System.out.println("Total XP: " + this.totalXp);
    }

    @Override
    public String toString() {
        return "\tName: " + this.name + "\n" +
                "\tUsername: " + this.username + "\n" +
                "\tTotalXp: " + totalXp;
    }
}
