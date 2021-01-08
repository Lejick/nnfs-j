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
            }
        }
        return a;
    }
}

