package com.rpoladia.jpm.section5;

public class CE014_SumOdd {
    public static void main(String[] args) {
        sumOdd(1, 100);
    }

    public static boolean isOdd(int number) {
        boolean result = false;
        if(number > 0 && number%2 == 1) {
            result = true;
        }
        return result;
    }

    public static int sumOdd(int start, int end) {
        int sum = -1;
        if( start > 0 && end > 0 && start <= end) {
            sum = 0;
            for(int i=start; i<=end;i++) {
                if(isOdd(i))
                    sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
