package kbased

fun main(args: Array<String>) {
    val sd = SpiralData()
    sd.createData(100, 3)
    val X = sd.x
    val y = sd.y
    val dense1 = LayerDense(2, 3)
    val activation1 = ActivationRelu()
    val dense2 = LayerDense(3, 3)
    val activation2 = ActivationSoftmax()
    dense1.forward(X)
    activation1.forward(dense1.output)
    dense2.forward(activation1.output)
    activation2.forward(dense2.output)
    println(activation2.output.contentDeepToString())
}