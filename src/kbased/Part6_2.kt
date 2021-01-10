package kbased

import org.nd4j.linalg.factory.Nd4j
import org.nd4j.linalg.ops.transforms.Transforms

fun main(args: Array<String>) {
    val layerOutputs = arrayOf(doubleArrayOf(4.8, 1.21, 2.385), doubleArrayOf(8.9, -1.81, 0.2), doubleArrayOf(1.41, 1.051, 0.026))
    var nd1 = Nd4j.create(layerOutputs)
    nd1 = Transforms.exp(nd1)
    var ndSum = nd1.sum(1)
    val result = nd1.divColumnVector(ndSum)
    ndSum = result.sum(1)
    println(result.toStringFull())
    println(ndSum.toStringFull())
    }