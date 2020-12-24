package jbased;

class LayerDense {
    double[][] weights;
    double[][] biases;
    double[][] output;

    public LayerDense(int n_inputs, int n_neurons) {
        weights = Part4.generateMatrix(n_inputs, n_neurons);
        biases = new double[n_neurons][];

    }

    public void forward(double[][] inputs) {
        output=Part3.dotProduct(inputs, weights);
    }
}
