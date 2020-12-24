package jbased;

public class ActivationRelu {
    double[][] output;

    public void forward(double[][] inputs) {
        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[0].length; j++) {
                if (inputs[i][j] < 0) inputs[i][j] = 0;
            }
        }
        output = inputs;
    }
}
