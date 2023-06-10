package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Busted Max Value = " + (myMaxByteValue + 1));
        System.out.println("Busted Min Value = " + (myMinByteValue - 1));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Busted Max Value = " + (myMaxShortValue + 1));
        System.out.println("Busted Min Value = " + (myMinShortValue - 1));

        long myLongValue = 100L; //or 100l
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Busted Max Value = " + (myMaxLongValue + 1));
        System.out.println("Busted Min Value = " + (myMinLongValue - 1));

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        /**
         * Casting
         */

        int myTotal = myMinIntValue/2;

        byte myNewByteValue = (byte) (myMinByteValue/2);
    }
}
