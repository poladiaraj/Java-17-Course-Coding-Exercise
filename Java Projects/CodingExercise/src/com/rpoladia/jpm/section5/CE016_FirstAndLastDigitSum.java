package com.rpoladia.jpm.section5;

public class CE016_FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        int result = -1;
        if(number > -1) {
                result = number%10;
                while(number > 9) {
                    number /= 10;
                }
                result += number;
        }
        return result;
    }
}
