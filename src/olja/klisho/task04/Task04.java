package olja.klisho.task04;

/**
 * Created by Ola-Mola on 07/03/16.
 */
// max (a1 + an; a2 + an-1; an + a1)
public class Task04 {

    public static void main(String[] args) {
        double ar [] = {1,2,3,4,5};
        double max = maxSum(ar);
        System.out.println(max);
    }

    public static  double maxSum (double ar []) {
        int n = ar.length;
        double max = (ar[0]+ ar[n-1]);
        for (int i = 0; i < n/2+1; i++) {
            if (max < ar[i]+ar[n-i-1])
                max = ar[i]+ar[n-i-1];
            System.out.println("i=" + i + " " + "ar[i]=" + ar[i] +  " " + "ar[n-i-1]=" + ar[n-i-1]);
        }
        return max;
    }
}
