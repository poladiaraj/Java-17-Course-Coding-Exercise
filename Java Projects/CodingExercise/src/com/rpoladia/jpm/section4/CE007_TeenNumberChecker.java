package com.rpoladia.jpm.section4;

public class CE007_TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        boolean result = false;

        if(isTeen(num1)) {
            result = true;
        } else if(isTeen(num2)) {
            result = true;
        } else {
            result = isTeen(num3);
        }

        System.out.println(result);
        return result;
    }

    public static boolean isTeen(int num) {
        if(num >= 13 && num <= 19) {
            return true;
        }
        return false;
    }
}
