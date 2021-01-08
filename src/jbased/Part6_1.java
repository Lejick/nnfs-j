package jbased;

import java.util.Arrays;

public class Part6_1 {
    public static void main(String[] args) {
        double[] layerOutputs = {4.8, 1.21, 2.385};
        double[] expValues = Arrays.stream(layerOutputs).map(x -> Math.exp(x)).toArray();
        System.out.println(Arrays.toString(expValues));
        double norm_base = Arrays.stream(expValues).sum();
        expValues = Arrays.stream(expValues).map(x -> x / norm_base).toArray();
        System.out.println(Arrays.toString(expValues));
        System.out.println(Arrays.stream(expValues).sum());
    }
}
