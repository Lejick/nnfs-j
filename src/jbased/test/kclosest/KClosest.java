package jbased.test.kclosest;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KClosest {
    private static Map<Point, Double> sharedMap = new HashMap<>();

    public static List<Point> find(List<Point> inputList, Point x, int k) {
        Map<Point, Double> map = new HashMap<>();
        for (Point p : inputList) {
            map.put(p, Math.sqrt(Math.pow(p.x - x.x, 2) + Math.pow(p.y - x.y, 2)));
        }
        Stream<Point> sorted =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue()).
                        limit(k).map(pointDoubleEntry -> pointDoubleEntry.getKey());
        return sorted.collect(Collectors.toList());
    }

    public static List<Point> find(Point newPoint, Point x, int k) {
        sharedMap.put(newPoint, Math.sqrt(Math.pow(newPoint.x - x.x, 2) + Math.pow(newPoint.y - x.y, 2)));
        Stream<Point> sorted =
                sharedMap.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue()).
                        limit(k).map(pointDoubleEntry -> pointDoubleEntry.getKey());
        return sorted.collect(Collectors.toList());
    }

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}