package olja.klisho.task02;

import java.awt.*;

/**
 * Created by Ola-Mola on 27/02/16.
 */
public class Task02 {

    public static void main(String[] args) {
        final double eps = 0.01;
        int n = 0;

        double an = a(n);

        while (an >= eps) {
            n++;
            an = a(n);
            System.out.println("a(" + n + ") = " + an);
        }

//        int nx = (int)(1 / Math.sqrt(eps));
//        System.out.println("nx = " + nx);
    }

    private static double a(int n) {

        return 1.0 / ((n + 1) * (n + 1));
    }
}

//Min finder this.eps
// MinFinder (double e) {this.e = e;}
// на классе можно создавать тесты
// на 1ый таск написать cmd.script
