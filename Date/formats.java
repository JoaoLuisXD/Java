package Date;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class formats {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2026-02-14");
        LocalDateTime d2 = LocalDateTime.parse("2026-02-14T01:30");
        Instant d3 = Instant.parse("2026-02-14T01:30:42Z");
        
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fm4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fm5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d1 = " + d1);
        System.out.println("d1 = " + d2);
        System.out.println("d1 = " + d3);

        System.out.println("---------------------------");
        System.out.println("d1 = " + d1.format(fm1));
        System.out.println("d2 = " + d2.format(fm2));
        System.out.println("d2 = " + d2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("d2 = " + d2.format(fm4));
        System.out.println("d3 = " + fm3.format(d3));
        System.out.println("d3 = " + fm5.format(d3));
        System.out.println("d3 = " + d3.toString());

    }
}
