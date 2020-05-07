package jbased;

public class MatrixTest {
    public static void main(String[] args) {
        Double[][] A = {{4.00, 3.00}, {2.00, 1.00}};
        Double[][] B = {{-0.500, 1.500}, {1.000, -2.0000}};
        Double[][] result = Part4.multiplicar(A, B);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}
