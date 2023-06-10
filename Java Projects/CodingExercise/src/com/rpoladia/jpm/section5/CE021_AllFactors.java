package com.rpoladia.jpm.section5;

public class CE021_AllFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {
        String result = "Invalid Value";
        if(number > 0) {
            java.util.List<String> factors = new java.util.ArrayList<>();
            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    factors.add(Integer.toString(i));
            }
            result = String.join(" ",factors);
        }
        System.out.println(result);
    }
}
