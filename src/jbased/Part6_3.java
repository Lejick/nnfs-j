package jbased;

import java.util.Arrays;

public class Part6_3 {
    public static void main(String[] args) {
        SpiralData sd = new SpiralData();
        sd.createData(100, 3);
        double[][] X = sd.getX();
        double[] y = sd.getY();
        LayerDense dense1 = new LayerDense(2, 3);
        ActivationRelu activation1 = new ActivationRelu();
        LayerDense dense2 = new LayerDense(3, 3);
        ActivationSotmax activation2 = new ActivationSotmax();
        dense1.forward(X);
        activation1.forward(dense1.output);
        dense2.forward(activation1.output);
        activation2.forward(dense2.output);
        System.out.println(Arrays.deepToString(activation2.output));
    }
}
