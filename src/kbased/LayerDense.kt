package kbased

import jbased.Part3
import jbased.Part4

internal class LayerDense(n_inputs: Int, n_neurons: Int) {
    var weights: Array<DoubleArray>
    var biases: Array<DoubleArray?>
    lateinit var output: Array<DoubleArray>
    fun forward(inputs: Array<DoubleArray>) {
        output = Part3.dotProduct(inputs, weights)
    }

    init {
        weights = Part4.generateMatrix(n_inputs, n_neurons)
        biases = arrayOfNulls(n_neurons)
    }
}