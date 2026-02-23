package Date;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class calendar {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");

        Date d = Date.from(Instant.parse("2026-02-22T23:41:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        /* cal.add(Calendar.HOUR, 4);
        d = cal.getTime(); */

        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println(sdf.format(d));

        System.out.println("minutes: " + minutes);
        System.out.println("month: " + month);
    }
}
