package kbased

class ActivationRelu {
    lateinit var output: Array<DoubleArray>
    fun forward(inputs: Array<DoubleArray>) {
        for (i in inputs.indices) {
            for (j in inputs[0].indices) {
                if (inputs[i][j] < 0) inputs[i][j] = 0.0
            }
        }
        output = inputs
    }
}