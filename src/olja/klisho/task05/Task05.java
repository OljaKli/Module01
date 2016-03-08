package olja.klisho.task05;

/**
 * Created by Ola-Mola on 28/02/16.
 */
public class Task05 {

    private void twoDimArr(int n) {

        int twoDimArr[][] = new int[n][n]; //creating Array n x n

        for (int i = 0; i < n; i++) {
            twoDimArr[i][i] = 1;
            twoDimArr[i][n - 1 - i] = 1;
            for (int j = 0; j < n; j++) {
                System.out.print(twoDimArr[i][j]);

            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        int n = 10;
        Task05 task05 = new Task05();
        task05.twoDimArr(n);

    }

}

