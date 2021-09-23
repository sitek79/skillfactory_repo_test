import clock.Clock;
import recursion.Recursion;

public class App {
    public static void main(String[] args) {
        Recursion rec = new Recursion();
        rec.recursion();
        Clock clk = new Clock();
        clk.printClock();
    }
}
