package kbased

import kotlin.math.ln

fun main(args: Array<String>) {
    val softmax_output = doubleArrayOf(0.7, 0.1, 0.2)
    val target_output = doubleArrayOf(1.0, 0.0, 0.0)
    val loss =
        -(ln(softmax_output[0]) * target_output[0] + ln(softmax_output[1]) * target_output[1] + ln(
            softmax_output[2]
        ) * target_output[2])
    println(loss)
}