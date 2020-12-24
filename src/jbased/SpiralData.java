package jbased;

import java.util.Random;

public class SpiralData {
    double[][] X;
    double[] y;

    public void createData(int points, int classes) {
        double[][] X = new double[points * classes][2];
        double[] y = new double[points * classes];
        Linspace lp = new Linspace(0, 1, points);
        Random rand = new Random();

        int t = 0;
        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < points; j++) {
                X[t][0] = rand.nextDouble();
                X[t][1] = Math.sin(rand.nextDouble());
                y[t] = i;
                t++;
            }
        }
        this.X = X;
        this.y = y;
    }

    public double[][] getX() {
        return X;
    }

    public double[] getY() {
        return y;
    }
}