package com.rpoladia.jpm.section4;

public class CE003_BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 0);
        shouldWakeUp(true, 7);
        shouldWakeUp(true, 23);
        shouldWakeUp(true, 24);
        shouldWakeUp(true, -1);
        shouldWakeUp(false, 8);
        shouldWakeUp(false, 22);
        shouldWakeUp(false, 17);
        shouldWakeUp(false, 0);
        shouldWakeUp(false, 7);
        shouldWakeUp(false, 23);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay >= 0 && hourOfDay <= 23) {
            if(hourOfDay < 8 || hourOfDay > 22) {
                System.out.println(barking);
                return barking;
            }
        }
        System.out.println(false);
        return false;
    }
}
