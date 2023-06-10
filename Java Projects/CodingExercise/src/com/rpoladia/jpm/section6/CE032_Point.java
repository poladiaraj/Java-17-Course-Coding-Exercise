package com.rpoladia.jpm.section6;

public class CE032_Point {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}

class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        if(this.x == 0 && this.y == 0)
            return 0;

        return distance(0,0);
    }

    public double distance(Point point) {
        double distance = 0;
        distance = distance(point.getX(), point.getY());

        return distance;
    }

    public double distance(int x, int y) {
        double distance = 0;
        int a = (x - getX()) * (x - getX());
        int b = (y - getY())*(y-getY());

        distance = Math.sqrt(a + b);

        return distance;
    }
}