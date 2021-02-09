package jbased.test.kclosest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Test {
    Point x = new Point(0D, 0D);
    int k = 10;

    @org.junit.jupiter.api.Test
    public void test1() {
        Point x = new Point(0d, 0d);
        Point a = new Point(1d, 1d);
        Point b = new Point(-1d, 0d);
        Point c = new Point(2d, 1d);
        List<Point> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        KClosest kClosest = new KClosest(2, x);
        Point[] resuls = kClosest.findAllArray(list);
        System.out.println(Arrays.toString(resuls));
    }



    @org.junit.jupiter.api.Test
    public void test2() {
        Random rand = new Random();
        KClosest kClosest = new KClosest(k, x);
        while (true) {
            Stream.generate(() -> new Point(rand.nextDouble() * 100, rand.nextDouble() * 100)).forEach(point -> {
                Point[] resultArray = kClosest.findFixedArray(point, x);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Arrays.toString(resultArray));
            });
        }
    }

    @org.junit.jupiter.api.Test
    public void test3() {
        Point x = new Point(0d, 0d);
        Point a = new Point(1d, 1d);
        Point b = new Point(-1d, 0d);
        Point c = new Point(2d, 1d);
        List<Point> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        KClosest kClosest = new KClosest(2, x);
        Point[] resuls = kClosest.findAllQueue(list);
        System.out.println(Arrays.toString(resuls));
    }

    @org.junit.jupiter.api.Test
    public void test4() {
        Random rand = new Random();
        KClosest kClosest = new KClosest(k, x);
        while (true) {
            Stream.generate(() -> new Point(rand.nextDouble() * 100, rand.nextDouble() * 100)).forEach(point -> {
                Point[] resultArray = kClosest.findFixedQueue(point);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Arrays.toString(resultArray));
            });
        }
    }
}
