package jbased.test.kclosest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Test {
    @org.junit.jupiter.api.Test
    public void test1() {
        Point x = new Point(0, 0);
        Point a = new Point(1, 1);
        Point b = new Point(-1, 0);
        Point c = new Point(2, 1);
        List<Point> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        List<Point> resultList = KClosest.find(list, x, 2);
        System.out.println(resultList);
    }

    @org.junit.jupiter.api.Test
    public void test2() {
        Point x = new Point(0, 0);
        Random rand = new Random();
        while (true) {
            Stream.generate(() -> new Point(rand.nextInt(10), rand.nextInt(10))).forEach(point -> {
                List<Point> resultList = KClosest.find(point, x, 2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(resultList);
            });
        }

    }
}
