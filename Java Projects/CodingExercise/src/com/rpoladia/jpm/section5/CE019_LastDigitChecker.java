package com.rpoladia.jpm.section5;

public class CE019_LastDigitChecker {
    public static void main(String[] args) {
        hasSameLastDigit (41, 22, 71);
        hasSameLastDigit (23, 32, 42);
        hasSameLastDigit (9, 99, 999);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        boolean result = false;

        if(isValid(num1) && isValid(num2) && isValid(num3)) {
            int remainder1 = num1%10;
            int remainder2 = num2%10;
            int remainder3 = num3%10;

            if(remainder1 == remainder2
                    || remainder2 == remainder3
                    || remainder1 == remainder3) {
                result = true;
            }
        }
        System.out.println(result);
        return result;
    }

    public static boolean isValid(int number) {
        if(number>=10 & number<=1000)
            return true;
        return false;
    }
}
