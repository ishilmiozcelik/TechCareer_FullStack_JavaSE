package ishilmiozcelik;

import java.util.Arrays;

public class _10_Arrays {

    public static void main(String[] args) {
        int[] Array1 = new int[5];
        Array1[0] = 1;
        Array1[1] = 2;
        Array1[2] = 3;
        Array1[3] = 4;
        Array1[4] = 5;

        System.out.println(Array1[0]);

        for (int i = 0; i < 5; i++) {
            System.out.println(Array1[i] + " ");
        }

        for (int i = 0; i < Array1.length; i++) {
            System.out.print(Array1[i]);
        }
        Arrays.sort(Array1);
        System.out.println("\n******");

        int[][] Matrix1 = new int[4][4];
        Matrix1[0][0] = 1;
        Matrix1[1][1] = 2;
        Matrix1[2][2] = 3;
        Matrix1[3][3] = 4;

        for (int i = 0; i < Matrix1.length; i++) {
            for (int j = 0; j < Matrix1[i].length; j++) {
                System.out.print(Matrix1[i][j]+" ");
            }

            System.out.println("");

        }


    }

}
