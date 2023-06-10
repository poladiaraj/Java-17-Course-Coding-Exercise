package com.rpoladia.jpm.section5;

import java.util.Scanner;

public class CE027_InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner lScanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int count = 0;

        while(lScanner.hasNextInt()) {
            sum += lScanner.nextInt();
            count++;
            avg = Math.round((double)sum/count);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
