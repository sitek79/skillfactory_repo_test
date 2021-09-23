import calendar.Calendar;
import clock.Clock;
import recursion.Recursion;

public class App {
    public static void main(String[] args) {
        Recursion rec = new Recursion();
        rec.recursion();
        Calendar cal = new Calendar();
        cal.printCalendar();
        Clock clk = new Clock("Класс часов построен");
        clk.printClock();
    }
}
