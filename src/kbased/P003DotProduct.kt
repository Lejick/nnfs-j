package kbased

import java.util.*

fun main(args: Array<String>) {
    val inputs = doubleArrayOf(1.0, 2.0, 3.0, 2.5)

    val weights = arrayOf(doubleArrayOf(0.2, 0.8, -0.5, 1.0), doubleArrayOf(.5, -0.91, 0.26, -0.5), doubleArrayOf(-0.26, -0.27, 0.17, 0.87))

    val biases = doubleArrayOf(2.0, 3.0, 0.5)

    println(Arrays.toString(add(dotProduct(weights, inputs), biases)))
}

fun dotProduct(input1: Array<DoubleArray>, input2: DoubleArray): DoubleArray {
    val outputs = DoubleArray(input1.size)
    for (i in input1.indices) {
        var output = 0.0
        for (j in input2.indices) {
            output += input1[i][j] * input2[j]
        }
        outputs[i] = output
    }
    return outputs
}

fun dotProduct(input1: Array<DoubleArray>, input2: Array<DoubleArray>): Array<DoubleArray>? {
    val result = Array(input1.size) { DoubleArray(input2[0].size) }
    for (i in input1.indices) {
        for (j in 0 until input2[0].size) {
            for (k in 0 until input1[0].size) {
                result[i][j] += input1[i][k] * input2[k][j]
            }
        }
    }
    return result
}


fun add(input1: DoubleArray, input2: DoubleArray): DoubleArray? {
    val output = DoubleArray(input1.size)
    for (i in input1.indices) {
        output[i] = input1[i] + input2[i]
    }
    return output
}