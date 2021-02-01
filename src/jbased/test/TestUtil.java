package jbased.test;

import org.junit.jupiter.api.Test;

public class TestUtil {

    @Test
    public void testXor() {
        int x = 2154;
        int y = 6009;

        x = x ^ y;
        y = y ^ x; //(x^y^y==x)
        x = x ^ y;//(x^y^x==y)

        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }

    @Test
    public void testBase64() {
        Base64Increment base64Increment = new Base64Increment(2);
        for (int i = 0; i < 1000; i++) {
            base64Increment.increment();
            System.out.println(base64Increment.getCurrentValue());
        }
    }
}
