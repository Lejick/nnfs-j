package jbased.test;

public class Test {
    @org.junit.jupiter.api.Test
    public void testXor() {
        int x = 2154;
        int y = 6009;

        x=x^y;
        y=y^x; //(x^y^y==x)
        x=x^y;//(x^y^x==y)

        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
