package jbased;

import java.util.Random;

public class Part4 {
    public static void main(String[] args) {
        double[][] X = {{1.0, 2.0, 3.0, 2.5},
                {2.0, 5.0, -1.0, 2.0},
                {-1.5, 2.7, 3.3, -0.8}};
        generateMatrix(3, 5);
    }

    public static double[][] generateMatrix(int m, int n) {
        Random r = new Random();
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = r.nextDouble();
              //  System.out.print(a[i][j] + "\t");
            }
        //    System.out.println();
        }
        return a;
    }

    public static double[] generateMatrix(int n) {
        Random r = new Random();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextDouble();
          //  System.out.print(a[i] + " ");
        }
        return a;
    }

    public static double[][] multiplicar(double[][] A, double[][] B) {
        int aRows = A.length;
        int aColumns = A[0].length;
        int bRows = B.length;
        int bColumns = B[0].length;
        if (aColumns != bRows) {
            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
        }

        double[][] C = new double[aRows][bColumns];
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                C[i][j] = 0.00000;
            }
        }

        for (int i = 0; i < aRows; i++) { // aRow
            for (int j = 0; j < bColumns; j++) { // bColumn
                for (int k = 0; k < aColumns; k++) { // aColumn
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

}

