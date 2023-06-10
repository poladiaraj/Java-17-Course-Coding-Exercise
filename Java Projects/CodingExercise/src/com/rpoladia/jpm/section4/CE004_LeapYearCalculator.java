package com.rpoladia.jpm.section4;

public class CE004_LeapYearCalculator {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(1700);
        isLeapYear(1996);
        isLeapYear(2017);
        isLeapYear(2000);
    }

    public static boolean isLeapYear(int year) {
        if(year >= 1 && year <= 9999) {
            if(year%4 == 0) {
                if(year%100 == 0) {
                    if(year%400 == 0) {
                        System.out.println(true);
                        return true;
                    } else {
                        System.out.println(false);
                        return false;
                    }
                } else {
                    System.out.println(true);
                    return true;
                }
            }
        }
        System.out.println(false);
        return false;
    }
}
