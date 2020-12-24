package kbased


object Part5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sd = SpiralData()
        sd.createData(100, 3)
        val x = sd.x
        val y = sd.y
        val layer1 = LayerDense(2, 5)
        val activation1 = ActivationRelu()
        layer1.forward(x)
        activation1.forward(layer1.output)
        println(activation1.output)
    }
}