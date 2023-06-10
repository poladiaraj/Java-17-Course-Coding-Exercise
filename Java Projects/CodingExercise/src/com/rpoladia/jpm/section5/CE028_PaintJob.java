package com.rpoladia.jpm.section5;

public class CE028_PaintJob {
    public static void main(String[] args) {
        getBucketCount(-3.4, 2.1, 1.5, 2);
        getBucketCount(3.4, 2.1, 1.5, 2);
        getBucketCount(2.75, 3.25, 2.5, 1);

        getBucketCount(-3.4, 2.1, 1.5);
        getBucketCount(3.4, 2.1, 1.5);
        getBucketCount(7.25, 4.3, 2.35);

        getBucketCount(3.4, 1.5);
        getBucketCount(6.26, 2.2);
        getBucketCount(3.26, 0.75);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int result = 0;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            result = -1;
        } else {
            double area = width*height;
            result = (int) Math.ceil(area/areaPerBucket);
            result -= extraBuckets;
        }
        System.out.println(result);
        return result;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int result = 0;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 ) {
            result = -1;
        } else {
            double area = width*height;
            result = (int) Math.ceil(area/areaPerBucket);
        }
        System.out.println(result);
        return result;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int result = 0;

        if( area <= 0 || areaPerBucket <= 0 ) {
            result = -1;
        } else {
            result = (int) Math.ceil(area/areaPerBucket);
        }
        System.out.println(result);
        return result;
    }
}