package Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class learningDate {
    public static void main(String[] args) {

        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();

        LocalDate d4 = LocalDate.parse("2026-02-13");
        LocalDateTime d5 = LocalDateTime.parse("2026-02-13T17:45:20");
        Instant d6 = Instant.parse("2026-02-13T17:45:20Z");
        Instant d7 = Instant.parse("2026-02-13T17:45:20-03:00");

        LocalDate d8 = LocalDate.parse("13/02/2026", fm1);
        LocalDateTime d9 = LocalDateTime.parse("13/02/2026 11:11", fm2);

        LocalDate d10 = LocalDate.of(2026,02,13);
        LocalDateTime d11 = LocalDateTime.of(2026,02,13,11,26,48);

        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);
        System.out.println("d4: " + d4);
        System.out.println("d5: " + d5);
        System.out.println("d6: " + d6);
        System.out.println("d7: " + d7);
        System.out.println("d8: " + d8);
        System.out.println("d9: " + d9);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);
        
    }
}
