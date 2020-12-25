package jbased;

import org.nd4j.linalg.api.buffer.DataType;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

import java.util.Random;

public class SpiralData {
    double[][] X;
    double[] y;

    public void createData(int points, int classes) {
        double[][] X = new double[points * classes][2];
        double[] y = new double[points * classes];
        INDArray indArray = Nd4j.linspace(0.0, 1.0, points, DataType.DOUBLE);
        double delta = 1 / (points * 5);
        Random r = new Random();
        int t = 0;
        for (int i = 0; i < classes; i++) {
            double angle = r.nextDouble() * 2 - 1;
            for (int j = 0; j < points; j++) {
                X[t][0] = indArray.getDouble(j);
                X[t][1] = X[t][0] * angle + delta;
                delta += delta;
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