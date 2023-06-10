package com.rpoladia.jpm.section4;

public class CE002_MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(1000);
        printMegaBytesAndKiloBytes(1124);
        printMegaBytesAndKiloBytes(-1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int MB_TO_KB_CONVERSION_RATE = 1024;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int megaBytes = kiloBytes/MB_TO_KB_CONVERSION_RATE;
        int remainingKiloBytes = kiloBytes%MB_TO_KB_CONVERSION_RATE;
        System.out.println( kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
}