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
                System.out.print(a[i][j] + "\t");
            }

        }
        return a;
    }

    public static double[] generateMatrix(int n) {
        Random r = new Random();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextDouble();
            System.out.print(a[i] + " ");
        }
        return a;
    }

}

class LayerDense {
    double[][] weights;
    double[][] biases;
    double[][] output;

    public LayerDense(int n_inputs, int n_neurons) {
        weights = Part4.generateMatrix(n_inputs, n_neurons);
        biases = new double[n_neurons][];

    }

    public void forward(double[][] inputs,double[][] weights) {
        output=Part3.dotProduct(inputs, weights);
    }
}