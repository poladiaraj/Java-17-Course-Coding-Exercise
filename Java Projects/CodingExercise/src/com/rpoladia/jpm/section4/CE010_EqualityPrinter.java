package com.rpoladia.jpm.section4;

public class CE010_EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int num1, int num2, int num3) {
        String result = "Invalid Value";
        if(num1>-1 && num2>-1 && num3>-1) {
            if(num1 == num2 && num2 == num3) {
                result = "All numbers are equal";
            } else if(num1!=num2 && num2!=num3 && num1!=num3) {
                result = "All numbers are different";
            } else {
                result = "Neither all are equal or different";
            }
        }

        System.out.println(result);
    }
}
