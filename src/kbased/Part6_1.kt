package kbased
    fun main(args: Array<String>) {
        val layer_outputs = doubleArrayOf(4.8, 1.21, 2.385)

        var expValues = layer_outputs.map { x: Double -> Math.exp(x) }
        println(expValues)
        val normBase = expValues.sum()
        expValues =expValues.map { x: Double -> x / normBase }
        println(expValues)
        println(expValues.sum())
    }