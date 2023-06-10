package com.rpoladia.jpm.section4;

public class CE006_EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1, -1, 0);
        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
    }

    public static boolean hasEqualSum(int num1, int num2, int sum) {
        boolean result = false;
        if(num1 + num2 == sum)
        {
            result = true;
        }

        System.out.println(result);
        return result;
    }
}
