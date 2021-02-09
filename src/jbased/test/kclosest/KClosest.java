package jbased.test.kclosest;


import java.util.*;

public class KClosest {
    private Point[] sharedArray;
    private PriorityQueue priorityQueue = new PriorityQueue();

    public KClosest(int k) {
        sharedArray = new Point[k];
    }

    public Point[] findAllArray(List<Point> inputList, Point x) {
        for (int i = 0; i < inputList.size(); i++) {
            Point newPoint = inputList.get(i);
            if (i < sharedArray.length) {
                sharedArray[i] = newPoint;
                continue;
            }
            for (int j = 0; j < sharedArray.length; j++) {
                if (newPoint.distance(x) < sharedArray[j].distance(x)) {
                    sharedArray[j] = newPoint;
                    continue;
                }
            }
        }
        return sharedArray;
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