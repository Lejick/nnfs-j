package kbased

import org.nd4j.linalg.api.buffer.DataType
import org.nd4j.linalg.factory.Nd4j
import java.util.*

class SpiralData {
    lateinit var x: Array<DoubleArray>
    lateinit var y: DoubleArray

    fun createData(points: Int, classes: Int) {
        val X = Array(points * classes) { DoubleArray(2) }
        val y = DoubleArray(points * classes)
        val indArray = Nd4j.linspace(0.0, 1.0, points.toLong(), DataType.DOUBLE)
        var delta = (1 / (points * 5)).toDouble()
        val r = Random()
        var t = 0
        for (i in 0 until classes) {
            val angle = r.nextDouble() * 2 - 1
            for (j in 0 until points) {
                X[t][0] = indArray.getDouble(j.toLong())
                X[t][1] = X[t][0] * angle + delta
                delta += delta
                y[t] = i.toDouble()
                t++
            }
        }
        x = X
        this.y = y
    }
}