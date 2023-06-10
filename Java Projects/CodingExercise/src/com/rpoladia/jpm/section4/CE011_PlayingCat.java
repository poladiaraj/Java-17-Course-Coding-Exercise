package com.rpoladia.jpm.section4;

public class CE011_PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean result = false;
        if(temperature >= 25)
        {
            if(summer && temperature<=45){
                result = true;
            } else if(temperature <= 35) {
                result = true;
            }
        }

        System.out.println(result);
        return result;
    }
}
