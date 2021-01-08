package jbased.test;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class TestMatrixProduct {

    public static void main(String[] args) {
        double[][] A = {{4.00, 3.00}, {2.00, 1.00}};
        double[][] B = {{-0.500, 1.500}, {1.000, -2.0000}};
        INDArray Array_A= Nd4j.create(A);
        INDArray Array_B= Nd4j.create(B);
        INDArray result=Array_A.mmul(Array_B);
        System.out.println(result.toStringFull());
    }
}
