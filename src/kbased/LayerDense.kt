package kbased

import generateMatrix


internal class LayerDense(n_inputs: Int, n_neurons: Int) {
    var weights: Array<DoubleArray>
    var biases: Array<DoubleArray?>
    lateinit var output: Array<DoubleArray>
    fun forward(inputs: Array<DoubleArray>) {
        output = dotProduct(inputs, weights)
    }

    init {
        weights = generateMatrix(n_inputs, n_neurons)
        biases = arrayOfNulls(n_neurons)
    }
}