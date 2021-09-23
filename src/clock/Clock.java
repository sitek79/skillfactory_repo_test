package clock;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock {
    Clock() {
        System.out.println("Класс часов построен");
    }
    public void printClock() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);
        calendar.roll(Calendar.MONTH, -2);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
