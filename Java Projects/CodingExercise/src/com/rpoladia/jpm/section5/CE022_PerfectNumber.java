package com.rpoladia.jpm.section5;

public class CE022_PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
    }

    public static boolean isPerfectNumber(int number) {
        boolean result = false;
        int sum = 0;

        if(number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                {
                    sum+=i;
                }
            }

            if(sum == number)
            {
                result = true;
            }
        }
        System.out.println(result);
        return result;
    }
}
