package kbased

import org.nd4j.linalg.factory.Nd4j

fun main() {
    val inputs = listOf(1.2, 5.1, 2.1)
    val weights = listOf(3.1, 2.1, 8.7)
    val bias = 3
    val nd1 = Nd4j.create(inputs)
    val nd2 = Nd4j.create(weights)
    var ndRes = nd1.mul(nd2)
    ndRes = ndRes.sum(0)
    val sum = ndRes.getDouble(0) + bias
    println(sum)
}

