package jbased;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.ops.transforms.Transforms;
public class Part6_2 {
    public static void main(String[] args) {
        double[][] layerOutputs = {{4.8, 1.21, 2.385},
                {8.9, -1.81, 0.2},
                {1.41, 1.051, 0.026}};
        INDArray nd1 = Nd4j.create(layerOutputs);
        nd1 = Transforms.exp(nd1);
        INDArray ndSum = nd1.sum(1);
        INDArray result = nd1.divColumnVector(ndSum);
        ndSum = result.sum(1);
        System.out.println(result.toStringFull());
        System.out.println(ndSum.toStringFull());
    }
}
