package kbased

import org.nd4j.linalg.factory.Nd4j
import org.nd4j.linalg.ops.transforms.Transforms

class ActivationSoftmax {
    lateinit var output: Array<DoubleArray>

    fun forward(inputs: Array<DoubleArray>) {
        var indArray = Nd4j.create(inputs)
        val ndMax = indArray.max(1)
        indArray = indArray.subColumnVector(ndMax)
        indArray = Transforms.exp(indArray)
        val sumArr = indArray.sum(1)
        indArray = indArray.divColumnVector(sumArr)
        output = indArray.toDoubleMatrix()
    }
}