package br.com.dio.challenge.domain.bootcamp.utils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatUtils {
    public static String dateFormatted(LocalDateTime localDateTime, String type) {
        if (type.equals("Date")) {
            return localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }
        if (type.equals("Time")) {
            return localDateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
        }

        return "";
    }

    public static String dateFormatted(LocalDate localDate, String type) {
        if (type.equals("Date")) {
            return localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }
        if (type.equals("Time")) {
            return localDate.format(DateTimeFormatter.ofPattern("HH:mm"));
        }

        return "";
    }

    public static String timeFormatted(Duration duration) {
        long hour = duration.toHours();
        long minutes = duration.minusHours(hour).toMinutes();

        return String.format("%01d hour %02d minutes", hour, minutes);
    }
}
