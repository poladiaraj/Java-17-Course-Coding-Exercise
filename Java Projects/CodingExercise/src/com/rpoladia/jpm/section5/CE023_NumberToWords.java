package com.rpoladia.jpm.section5;

public class CE023_NumberToWords {
    public static void main(String[] args) {
        numberToWords(121);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(-222);
    }

    public static void numberToWords(int number) {
        int ogNumber = number;
        int reverse = reverse(number);
        number = reverse;

        if(number>=0) {
            if(number == 0) {
                System.out.println("Zero");
            }
            while(number != 0) {
                switch (number%10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                number /= 10;
            }

            for(int i=0; i<(getDigitCount(ogNumber)-getDigitCount(reverse)); i++) {
                System.out.println("Zero");
            }
            return;
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;

        while(number != 0) {
            reverseNumber += number%10;
            reverseNumber *= 10;
            number /= 10;
        }
        reverseNumber /= 10;

        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if(number < 0)
            return -1;
        return Integer.toString(number).length();
    }
}