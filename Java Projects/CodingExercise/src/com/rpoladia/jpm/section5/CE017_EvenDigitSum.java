package com.rpoladia.jpm.section5;

public class CE017_EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        int result = -1;

        if(number > -1) {
            result = 0;
            while(number > 0) {
                if(number%2 == 0){
                    result += number%10;
                }
                number /= 10;
            }
        }
        return result;
    }
}
