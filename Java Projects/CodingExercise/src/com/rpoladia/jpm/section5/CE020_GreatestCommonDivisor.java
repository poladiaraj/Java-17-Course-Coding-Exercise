package com.rpoladia.jpm.section5;

public class CE020_GreatestCommonDivisor {
    public static void main(String[] args) {
        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(12, 30);
        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(81, 153);
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        int result = -1;

        if(num1>=10 && num2>=10) {
            for(int i=1; i<=Math.min(num1,num2); i++) {
                if(num1%i==0 && num2%i==0)
                    result = i;
            }
        }
        System.out.println(result);
        return result;
    }
}
