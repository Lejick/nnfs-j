package jbased.test.kclosest;


import java.util.*;

public class KClosest {
    private Point[] sharedArray;
    private Point vertex;
    private PriorityQueue<Point> priorityQueue = new PriorityQueue(new Comparator<Point>() {
        @Override
        public int compare(Point o1, Point o2) {
            return o1.distance(vertex) < o2.distance(vertex) ? -1 : 1;
        }
    });

    public KClosest(int k, Point vertex) {
        sharedArray = new Point[k];
        this.vertex = vertex;
    }

    public Point[] findAllArray(List<Point> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            Point newPoint = inputList.get(i);
            if (i < sharedArray.length) {
                sharedArray[i] = newPoint;
                continue;
            }
            for (int j = 0; j < sharedArray.length; j++) {
                if (newPoint.distance(vertex) < sharedArray[j].distance(vertex)) {
                    sharedArray[j] = newPoint;
                    continue;
                }
            }
        }
        return sharedArray;
    }

    public Point[] findAllQueue(List<Point> inputList) {
        Point[] result = new Point[sharedArray.length];
        for (Point p : inputList) {
            priorityQueue.add(p);
        }
        int i = 0;
        for (Point p : priorityQueue) {
            result[i] = p;
            i++;
            if (i == result.length) break;
        }
        return result;
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

    public Point[] findFixedQueue(Point newPoint) {
        Point[] result = new Point[sharedArray.length];
        priorityQueue.add(newPoint);
        int i = 0;
        for (Point p : priorityQueue) {
            result[i] = p;
            i++;
            if (i == result.length) break;
        }
        return result;
    }

}