package br.com.dio.challenge;

import br.com.dio.challenge.domain.bootcamp.Bootcamp;
import br.com.dio.challenge.domain.bootcamp.activity.*;
import br.com.dio.challenge.domain.bootcamp.activity.enums.ActivityLevel;
import br.com.dio.challenge.domain.bootcamp.dev.Dev;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Java Fullstack", "Java + Angular", LocalDate.now());
        Content course = new Course(
                "POO com Java",
                "Aprendendo Programação Orientada a Objetos",
                ActivityLevel.INTERMEDIARY,
                8,
                bootcamp);
        Content challengeDesign = new ChallengeDesign(
                "Crie um Banco digital",
                "Crie um Banco Digital com Java + Angular",
                ActivityLevel.ADVANCED,
                6,
                bootcamp);
        Content challengeCode = new ChallengeCode(
                "Condições, Loops e Exceções",
                "Codifique Condições, Loops e Exceções com Java",
                ActivityLevel.BASIC,
                2,
                bootcamp);
        Content mentoring = new Mentoring(
                "Paradigmas de Programação",
                "Live sobre Paradigmas de Programação",
                LocalDateTime.now().withHour(19).withMinute(30),
                Duration.ofHours(1).plusMinutes(30),
                bootcamp);

        bootcamp.showBootcampInfo();

        Dev dev = new Dev("Rafael S Silva", "rafaelssilva");
        dev.registerBootcamp(bootcamp);
        dev.progress(course);
        dev.progress(challengeCode);
        dev.progress(mentoring);
        dev.progress(challengeDesign);
        dev.showDevInfo();

        Dev dev2 = new Dev("Dev 2", "dev2");
        dev2.registerBootcamp(bootcamp);
        dev2.progress(mentoring);
        dev2.progress(challengeCode);
        dev2.showDevInfo();

        bootcamp.showDevs();
    }
}