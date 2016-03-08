package olja.klisho.task03;
import java.util.Formatter;
/**
 * Created by Ola-Mola on 28/02/16.
 */
public class Task03 {
Formatter formatter = new Formatter();
    private void table (double h, double a, double b) {
        System.out.println("x\tF(x)");
        for (double x = a; x <= b; x += h) {
   //         System.out.println (formatter.format("- %-7dok%n",(x + "\t" + f(x))));//printf
            System.out.println (x + "\t" + f(x));
        }
    }

    private static double f(double x) {
        return Math.tan(2 * x) - 3;
    }

    public static void main(String[] args) {
        final double h = Math.PI / 16;
        final double a = 0.0;
        final double b = Math.PI;

        Task03 task03 = new Task03();
        task03.table(h, a, b);

    }

}
