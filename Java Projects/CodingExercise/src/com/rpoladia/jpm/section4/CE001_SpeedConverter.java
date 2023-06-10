package com.rpoladia.jpm.section4;

public class CE001_SpeedConverter {

    public static void main(String[] args) {
        printConversion(0);
        printConversion(16);
        printConversion(-1);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour > -1) {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
            return;
        }
        System.out.println("Invalid Value");
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        final double MILES_TO_KMS_CONVERSION_RATE = 1.609;
        if(kilometersPerHour < 0) {
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour/MILES_TO_KMS_CONVERSION_RATE);
        return milesPerHour;
    }
}
