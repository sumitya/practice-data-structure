package com.company.LC.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

class Point implements Comparable<Point> {
    double  eluDistance;
    int x;
    int y;

    public Point(double eluDistance, int x, int y) {
        this.eluDistance = eluDistance;
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point p) {
        return  (int)p.eluDistance - (int)this.eluDistance;
    }
}
public class KClosestPointsToOrigin_973 {
    public static void main(String[] args) {
        // [[1,3],[-2,2]]
        int[][] points = new int[][]{{1,3},{-2,2}};
        int[][] res = kClosest(points,1);

        System.out.println(Arrays.toString(res[0]));
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> queue = new PriorityQueue<>();
        for (int[] p : points) {
            // calc. Euclidean distance √(x1 - x2)2 + (y1 - y2)2 , since
            // x2,y2 = 0 ,eDist = √(x1^2 + y1^2) , or just (x1^2 + y1^2)
            double eluDistance = ((p[0] * p[0]) + (p[1] * p[1]));
            // adding to heap(PQ) creates minheap by default.
            queue.offer(new Point(eluDistance, p[0], p[1]));
            // just keep k closest points to the origin in heap
            while (queue.size() > k)
                queue.poll();
        }
        // map queue to array
        int[][] res = new int[queue.size()][2];
        int i = 0;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            res[i][0] = point.x;
            res[i][1] = point.y;
            i++;
        }
        return res;
    }
}
