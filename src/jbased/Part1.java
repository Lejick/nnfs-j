package jbased;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Part1 {
    public static void main(String[] args) {
        double[] inputs = {1.2, 5.1, 2.1};
        double[] weights = {3.1, 2.1, 8.7};
        double bias = 3;
        INDArray nd1 = Nd4j.create(inputs);
        INDArray nd2 = Nd4j.create(weights);
        INDArray ndRes = nd1.mul(nd2);
        ndRes = ndRes.sum(0);
        double sum = ndRes.getDouble(0) + bias;
        System.out.println(sum);
    }
}
