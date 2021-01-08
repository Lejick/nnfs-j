package jbased;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Part5 {
    public static void main(String[] args) throws IOException {
        SpiralData sd = new SpiralData();
        sd.createData(100, 3);
        double[][] x = sd.getX();
        double[] y = sd.getY();
        LayerDense layer1 = new LayerDense(2, 5);
        ActivationRelu activation1 = new ActivationRelu();
        layer1.forward(x);
        activation1.forward(layer1.output);
        System.out.println(Arrays.deepToString(activation1.output));

    }

    public void printImage(double[][] x) throws IOException {
        BufferedImage image = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D = image.createGraphics();
        graphics2D.setPaint(Color.RED);
        for (int i = 0; i < 300; i++) {
            int x1 = (int) (x[i][0] * 1000) + 100;
            int x2 = (int) (x[i][1] * 1000) + 100;
            graphics2D.fillRect(x1, x2, 1, 1);
        }
        graphics2D.dispose();

        ImageIO.write(image, "png", new File("image.png"));
    }

}

