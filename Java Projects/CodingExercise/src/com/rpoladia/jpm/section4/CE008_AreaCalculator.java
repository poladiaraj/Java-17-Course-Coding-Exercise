package com.rpoladia.jpm.section4;

public class CE008_AreaCalculator {
    public static void main(String[] args) {
        area(5.0);
        area(-1);
        area(5.0, 4.0);
        area(-1.0,4.0);
    }

    public static double area(double radius) {
        double result = -1;
        if(radius >= 0.0) {
            result = radius*radius*Math.PI;
        }
        System.out.println(result);
        return result;
    }

    public static double area(double length, double breadth) {
        double result = -1;
        if(length >= 0.0 && breadth >= 0.0) {
            result = length*breadth;
        }

        System.out.println(result);
        return result;
    }
}