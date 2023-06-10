package com.rpoladia.jpm.section5;

public class CE018_SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(12, 23);
        hasSharedDigit(9, 99);
        hasSharedDigit(15, 55);
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        boolean result = false;

        if(num1>9 && num1<100 && num2>9 && num2<100) {
            if(num1 == num2) {
                result = true;
            }

            while(num1 > 0) {
                if(num1%10 == num2 || num1%10 == num2%10 || num1%10 == (num2/10)%10) {
                    result = true;
                }
                num1 /= 10;
            }
        }

        System.out.println(result);
        return result;
    }
}
