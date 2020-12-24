package jbased;


public class Part5 {
    public static void main(String[] args) {
        SpiralData sd = new SpiralData();
        sd.createData(100,3);
        double[][] x = sd.getX();
        double[] y = sd.getY();

        LayerDense layer1 = new LayerDense(2, 5);
        ActivationRelu activation1 = new ActivationRelu();
        layer1.forward(x);
        activation1.forward(layer1.output);

        System.out.println(activation1.output);

    }

}

