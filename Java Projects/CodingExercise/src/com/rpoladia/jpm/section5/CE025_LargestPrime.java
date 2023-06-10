package com.rpoladia.jpm.section5;

public class CE025_LargestPrime {
    public static void main(String[] args) {
        getLargestPrime (21);
    }

    public static int getLargestPrime(int number) {
        int result = -1;

        if(number >= 2) {
            result = 2;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    boolean isPrime = true;
                    for(int j=2; j<Math.sqrt(i)+1; j++) {
                        if(i%j == 0){
                            isPrime = false;
                        }
                    }
                    if(isPrime && result<i){
                        result = i;
                        isPrime = true;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
