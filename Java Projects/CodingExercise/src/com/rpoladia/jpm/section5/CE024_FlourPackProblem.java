package com.rpoladia.jpm.section5;

//TODO Pending
public class CE024_FlourPackProblem {
    public static void main(String[] args) {

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean result = false;

        if(bigCount>=0 && smallCount>=0 && goal>0) {
            if((bigCount*5 + smallCount*1) >= goal) {
                while(goal != 0){
                    if(goal>=5 && bigCount>0) {
                        goal -= 5;
                        bigCount--;
                    } else if(goal>=1 && smallCount>0) {
                        goal -= 1;
                        smallCount--;
                    } else if(goal == 0){
                        result = true;
                    } else if(goal < 0) {
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
