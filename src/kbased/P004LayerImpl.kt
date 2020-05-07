import jbased.Part3
import jbased.Part4
import java.util.*

fun main(args: Array<String>) {
    val X = arrayOf(doubleArrayOf(1.0, 2.0, 3.0, 2.5), doubleArrayOf(2.0, 5.0, -1.0, 2.0), doubleArrayOf(-1.5, 2.7, 3.3, -0.8))
    generateMatrix(3, 5)
}

fun generateMatrix(m: Int, n: Int): Array<DoubleArray>? {
    val r = Random()
    val a = Array(m) { DoubleArray(n) }
    for (i in 0 until m) {
        for (j in 0 until n) {
            a[i][j] = r.nextDouble()
            print(a[i][j].toString() + "\t")
        }
        println()
    }
    return a
}

fun generateMatrix(n: Int): DoubleArray? {
    val r = Random()
    val a = DoubleArray(n)
    for (i in 0 until n) {
        a[i] = r.nextDouble()
        print(a[i].toString() + " ")
    }
    return a
}

fun multiplicar(A: Array<Array<Double>>, B: Array<Array<Double>>): Array<Array<Double>> {
    val aRows = A.size
    val aColumns: Int = A[0].size
    val bRows = B.size
    val bColumns: Int = B[0].size
    require(aColumns == bRows) { "A:Rows: $aColumns did not match B:Columns $bRows." }
    var c = arrayOf<Array<Double>>()
    for (i in 0 until aRows) {
        for (j in 0 until bColumns) {
            c[i][j] = 0.00000
        }
    }
    for (i in 0 until aRows) {
        for (j in 0 until bColumns) {
            for (k in 0 until aColumns) {
                c[i][j] = c[i][j] + A[i][k] * B[k][j]
            }
        }
    }
    return c
}

internal abstract class LayerDense(n_inputs: Int, n_neurons: Int) {
    var weights: Array<DoubleArray> = Part4.generateMatrix(n_inputs, n_neurons)
    var biases: Array<DoubleArray?> = arrayOfNulls(n_neurons)
    abstract var output: Array<DoubleArray>

    fun forward(inputs: Array<DoubleArray>, weights: Array<DoubleArray>) {
        output = Part3.dotProduct(inputs, weights)
    }
}