public class Part1 {
    public static void main(String[] args) {
        float[] inputs = {1.2f, 5.1f, 2.1f};
        float[] weights = {3.1f, 2.1f, 8.7f};
        float bias = 3;
        float output = inputs[0] * weights[0] + inputs[1] * weights[1] + inputs[2] * weights[2] + bias;
        System.out.println(output);

    }
}
