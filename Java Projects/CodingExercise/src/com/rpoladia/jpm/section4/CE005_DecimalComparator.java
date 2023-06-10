package com.rpoladia.jpm.section4;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CE005_DecimalComparator {
    public static void main(String[] args) {
        //areEqualByThreeDecimalPlaces(-4.3210,1.2345);
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        //areEqualByThreeDecimalPlaces(3.175, 3.176);
        //areEqualByThreeDecimalPlaces(3.0, 3.0);
        //areEqualByThreeDecimalPlaces(-3.123, 3.123);
        //areEqualByThreeDecimalPlaces(3.1234567890, 3.1234567890);
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        String Number1 = decimalFormat.format(number1);
        String Number2 = decimalFormat.format(number2);
        System.out.println("Number1: " + Number1);
        System.out.println("Number2: " + Number2);
        boolean result = Number1.equals(Number2);

        System.out.println(result);
        return result;
    }
}
