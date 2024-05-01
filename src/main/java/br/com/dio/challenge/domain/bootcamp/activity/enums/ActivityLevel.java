package br.com.dio.challenge.domain.bootcamp.activity.enums;

import lombok.Getter;


@Getter
public enum ActivityLevel {
    BASIC("Básico"),
    INTERMEDIARY("Intermediário"),
    ADVANCED("Avançado");

    private final String levelName;

    ActivityLevel(String levelName) {
        this.levelName = levelName;
    }
}
