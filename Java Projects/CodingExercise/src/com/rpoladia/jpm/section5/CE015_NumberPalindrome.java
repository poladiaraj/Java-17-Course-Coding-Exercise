package com.rpoladia.jpm.section5;

public class CE015_NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int number) {
        int ogNumber = number;
        int reverseNumber = 0;

        while(number != 0) {
            reverseNumber += number%10;
            if(number>=10 || number<=-10)
                reverseNumber*=10;
            number/=10;
        }

        return ogNumber == reverseNumber;
    }
}
