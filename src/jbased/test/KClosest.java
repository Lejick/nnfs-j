package jbased.test;


import java.util.*;

public class KClosest {

    public static List<Point> find(List<Point> inputList, Point x, int k) {
        Map<Point, Double> map = new HashMap<>();
        for (Point p : inputList) {
            map.put(p, Math.sqrt(Math.pow(p.x - x.x, 2) + Math.pow(p.y - x.y, 2)));
        }
        return inputList;
    }

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}