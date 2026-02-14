package Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class convert {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2026-02-14");
        LocalDateTime d2 = LocalDateTime.parse("2026-02-14T01:30");
        Instant d3 = Instant.parse("2026-02-14T01:30:22Z");

        LocalDate r1 = LocalDate.ofInstant(d3, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d3, ZoneId.of("Europe/Berlin"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d3, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d3, ZoneId.of("Europe/Berlin"));

        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("------------------------");

        System.out.println("d1 year = " + d1.getYear());
        System.out.println("d1 month = " + d1.getMonthValue());
        System.out.println("d1 day = " + d1.getDayOfMonth());

        System.out.println("d2 hour = " + d2.getHour());
        System.out.println("d2 minute = " + d2.getMinute());

    }
}
