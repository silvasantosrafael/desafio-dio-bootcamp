package br.com.dio.challenge;

import br.com.dio.challenge.domain.bootcamp.Bootcamp;
import br.com.dio.challenge.domain.bootcamp.activity.Activity;
import br.com.dio.challenge.domain.bootcamp.activity.ChallengeDesign;
import br.com.dio.challenge.domain.bootcamp.activity.Course;
import br.com.dio.challenge.domain.bootcamp.activity.Mentoring;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityLevel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Java Fullstack", "Java + Angular", LocalDate.now());
        Activity course = new Course(
                "POO com Java",
                "Aprendendo Programação Orientada a Objetos",
                ActivityLevel.INTERMEDIARY,
                8,
                bootcamp);
        Activity challengeDesign = new ChallengeDesign(
                "Crie um Banco digital",
                "Crie um Banco Digital com Java + Angular",
                ActivityLevel.ADVANCED,
                6,
                bootcamp);
        Activity mentoring = new Mentoring(
                "Paradigmas de Programação",
                "Live sobre Paradigmas de Programação",
                bootcamp);

        bootcamp.showBootcampInfo();

    }
}