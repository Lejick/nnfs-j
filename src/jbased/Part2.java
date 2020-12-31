package jbased;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
public class Part2 {
    public static void main(String[] args) {
        double bias1 = 2;
        double bias2 = 3;
        double bias3 = 0.5;
        INDArray inputs = Nd4j.create(new double[]{1d, 2d, 3d, 2.5d});
        INDArray weights1 = Nd4j.create(new double[]{0.2d, 0.8d, -0.5d, 1.0d});
        INDArray weightsArr2 = Nd4j.create(new double[]{0.5d, -0.91d, 0.26d, -0.5d});
        INDArray weightsArr3 = Nd4j.create(new double[]{-0.26d, -0.27d, 0.17d, 0.87d});

        INDArray outputArr = Nd4j.create(new double[]{weights1.mul(inputs).sum(0).getDouble(0) + bias1,
                weightsArr2.mul(inputs).sum(0).getDouble(0) + bias2,
                weightsArr3.mul(inputs).sum(0).getDouble(0) + bias3});

        System.out.println(outputArr);
    }
}
