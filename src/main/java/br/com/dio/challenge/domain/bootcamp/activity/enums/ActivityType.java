package br.com.dio.challenge.domain.bootcamp.activity.enums;

import lombok.Getter;


@Getter
public enum ActivityType {
    COURSE("Curso"),
    CHALLENGE_DESIGN("Desafio de Projeto"),
    MENTORING("Mentoria");

    private final String typeName;

    ActivityType(String typeName) {
        this.typeName = typeName;
    }
}
