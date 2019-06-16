package DT;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String args []){
        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(2009, 2, 24);
        gc.add(GregorianCalendar.DATE, 2);
        Date d2 = gc.getTime();
        System.out.println(d2);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2009, 2, 24);
        System.out.println(ld);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/Y");
        System.out.println(dtf.format(ld));
    }
}
