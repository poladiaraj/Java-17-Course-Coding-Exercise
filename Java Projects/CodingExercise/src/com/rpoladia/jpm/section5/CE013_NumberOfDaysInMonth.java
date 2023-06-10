package com.rpoladia.jpm.section5;

public class CE013_NumberOfDaysInMonth {
    public static void main(String[] args) {
        getDaysInMonth(1,2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
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

    public static int getDaysInMonth(int month, int year) {
        int result = -1;
        if(month>=1 && month <= 12 && year >= 1 && year <= 9999) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    result=31;
                    break;
                case 4: case 6: case 9: case 11:
                    result = 30;
                    break;
                case 2:
                    result = 28;
                    if(isLeapYear(year))
                        result = 29;
                    break;
            }
        }
        System.out.println(result);
        return result;
    }
}
