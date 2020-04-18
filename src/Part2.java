import java.util.Arrays;

public class Part2 {
    public static void main(String[] args) {
        double[] inputs = {1d, 2d, 3d,2.5d};
        double[] weights1 = {0.2d, 0.8d, -0.5d,1.0d};
        double[] weights2 = {0.5d, -0.91d, 0.26d,-0.5d};
        double[] weights3 = {-0.26d, -0.27d, 0.17d,0.87d};
        double bias1 = 2;
        double bias2 = 3;
        double bias3 = 0.5;
        double[] output = {inputs[0] * weights1[0] + inputs[1] * weights1[1] + inputs[2] * weights1[2] + inputs[3] * weights1[3]+bias1,
                inputs[0] * weights2[0] + inputs[1] * weights2[1] + inputs[2] * weights2[2] + inputs[3] * weights2[3]+bias2,
                inputs[0] * weights3[0] + inputs[1] * weights3[1] + inputs[2] * weights3[2] + inputs[3] * weights3[3]+bias3};

        System.out.println(Arrays.toString(output));

    }
}
