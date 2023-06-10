package academy.learnprogramming;

public class Challenge {
    public static void main(String[] args) {
        byte myByteNumber = 96;
        short myShortNumber = 6496;
        int myIntNumber = 14041974;

        long myLongNumber = 50000L + 10L*(myByteNumber + myShortNumber + myIntNumber);

        System.out.println(myLongNumber);

        short myShortTotal = (short) (1000 + 10*(myByteNumber + myShortNumber + myIntNumber));
    }
}
