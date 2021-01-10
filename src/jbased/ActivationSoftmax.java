package jbased;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.ops.transforms.Transforms;

public class ActivationSoftmax {
    double[][] output;

    public void forward(double[][] inputs) {
        INDArray indArray = Nd4j.create(inputs);
        INDArray ndMax = indArray.max(1);
        indArray = indArray.subColumnVector(ndMax);
        indArray = Transforms.exp(indArray);
        INDArray sumArr=indArray.sum(1);
        indArray=indArray.divColumnVector(sumArr);
        output = indArray.toDoubleMatrix();
    }
}
