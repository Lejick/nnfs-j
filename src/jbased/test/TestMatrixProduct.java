package jbased.test;

import jbased.Part4;

public class TestMatrixProduct {

    public static void main(String[] args) {
        double[][] A = {{4.00, 3.00}, {2.00, 1.00}};
        double[][] B = {{-0.500, 1.500}, {1.000, -2.0000}};
        double[][] result = Part4.multiplicar(A, B);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}
