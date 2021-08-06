package com.revature.challenge.problems.two;

import java.util.Arrays;

public class MainChallengeAgo02ProblemTwo {

    public static void main(String[] args){
        int max = 10;
        int min=0;
        int[] array = new int[max-1];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)((Math.random())*(max-min)) +min;
        }

        System.out.println(Arrays.toString(array));
    }

}
