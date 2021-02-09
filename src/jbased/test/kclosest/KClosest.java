package jbased.test.kclosest;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KClosest {
    private Map<Point, Double> sharedMap = new HashMap<>();
    private Point[] sharedArray;
    private int capacity;

    public KClosest(int k) {
        sharedArray = new Point[k];
        capacity = k;
    }

    public List<Point> findStreamStyle(List<Point> inputList, Point x) {
        Map<Point, Double> map = new HashMap<>();
        for (Point p : inputList) {
            map.put(p, x.distance(p));
        }
        Stream<Point> sorted =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue()).
                        limit(capacity).map(pointDoubleEntry -> pointDoubleEntry.getKey());
        return sorted.collect(Collectors.toList());
    }

    public List<Point> findOnceStreamStyle(Point newPoint, Point x) {
        sharedMap.put(newPoint, x.distance(newPoint));
        Stream<Point> sorted =
                sharedMap.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue()).
                        limit(capacity).map(pointDoubleEntry -> pointDoubleEntry.getKey());
        return sorted.collect(Collectors.toList());
    }

    public Point[] findFixedArray(Point newPoint, Point x) {
        for (int i = 0; i < sharedArray.length; i++) {
            if (sharedArray[i] == null) {
                sharedArray[i] = newPoint;
                return sharedArray;
            }
        }
        for (int i = 0; i < sharedArray.length; i++) {
            if (newPoint.distance(x) < sharedArray[i].distance(x)) {
                sharedArray[i] = newPoint;
                return sharedArray;
            }
        }
        return sharedArray;
    }

}

class Point {
    Double x;
    Double y;

    public Point(Double x, Double y) {
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

    public Double distance(Point other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }
}