package com.rpoladia.jpm.section4;

public class CE009_MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes) {
        final long MINUTES_IN_A_DAY = 24*60;
        final long MINUTES_IN_A_YEAR = 365*24*60;

        String result = "Invalid Value";
        //"XX min = YY y and ZZ d"

        if(minutes >= 0) {
            long years = minutes/MINUTES_IN_A_YEAR;
            long days = (minutes%MINUTES_IN_A_YEAR)/MINUTES_IN_A_DAY;
            result = minutes + " min = " + years + " y and " + days + " d";
        }
        System.out.println(result);
    }
}
