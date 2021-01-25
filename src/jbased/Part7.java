package jbased;


public class Part7 {
    public static void main(String[] args) {
        double[] softmax_output ={0.7, 0.1, 0.2};
        double[] target_output ={1, 0, 0};
        double loss=-(Math.log(softmax_output[0]) * target_output[0] +
                Math.log(softmax_output[1]) * target_output[1] +
                Math.log(softmax_output[2]) * target_output[2]);
        System.out.println(loss);
    }
}

