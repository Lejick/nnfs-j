package kbased

import jbased.Linspace
import java.util.*


class SpiralData {
    lateinit var x: Array<DoubleArray>
    lateinit var y: DoubleArray

    fun createData(points: Int, classes: Int) {
        val X = Array(points * classes) { DoubleArray(2) }
        val y = DoubleArray(points * classes)
        val lp = Linspace(0.0, 1.0, points.toDouble())
        val rand = Random()
        var t = 0
        for (i in 0 until classes) {
            for (j in 0 until points) {
                X[t][0] = rand.nextDouble()
                X[t][1] = Math.sin(rand.nextDouble())
                y[t] = i.toDouble()
                t++
            }
        }
        x = X
        this.y = y
    }

}