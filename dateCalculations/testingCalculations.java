package dateCalculations;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class testingCalculations {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2026-02-20");
        LocalDateTime d2 = LocalDateTime.parse("2026-02-20T01:20");
        Instant d3 = Instant.parse("2026-02-20T01:30:26Z");

        LocalDate lastWeekLocalDate = d1.minusDays(7);
        LocalDate nextWeekLocalDate = d1.plusDays(7);

        System.out.println("last week LocalDate: " + lastWeekLocalDate);
        System.out.println("next week LocalDate: " + nextWeekLocalDate);

        LocalDateTime lastWeekLocalDateTime = d2.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d2.plusDays(7);

        System.out.println("last week LocalDateTime: " + lastWeekLocalDateTime);
        System.out.println("next week LocalDateTime: " + nextWeekLocalDateTime);

        Instant lastWeekInstant = d3.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d3.plus(7, ChronoUnit.DAYS);

        System.out.println("last week Instant: " + lastWeekInstant);
        System.out.println("next week Instant: " + nextWeekInstant);

        Duration t1 = Duration.between(lastWeekLocalDate.atStartOfDay(), d1.atStartOfDay());
        Duration t2 = Duration.between(lastWeekLocalDateTime, d2);
        Duration t3 = Duration.between(lastWeekInstant, d3);
        Duration t4 = Duration.between(d3, lastWeekInstant);

        System.out.println("duration 1: " + t1.toDays());
        System.out.println("duration 2: " + t2.toDays());
        System.out.println("duration 3: " + t3.toDays());
        System.out.println("duration 4: " + t4.toDays());
    }
}
