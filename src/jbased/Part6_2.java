package jbased;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.ops.transforms.Transforms;

import java.util.Arrays;

public class Part6_2 {
    public static void main(String[] args) {
        double[][] layerOutputs = {{4.8, 1.21, 2.385},
                {8.9, -1.81, 0.2},
                {.41, 1.051, 0.026}};
        INDArray nd1 = Nd4j.create(layerOutputs);
        nd1 = Transforms.exp(nd1);
        System.out.println(nd1.toStringFull());
        System.out.println();
        INDArray ndSum = nd1.sum(1);
        System.out.println(ndSum.toStringFull());
        System.out.println();
        INDArray result = nd1.divColumnVector(ndSum);
        System.out.println(result.toStringFull());
        System.out.println();
        ndSum = result.sum(1);
        System.out.println(ndSum.toStringFull());
    }
}
