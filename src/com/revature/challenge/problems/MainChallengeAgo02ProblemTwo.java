package com.revature.challenge.problems;

import com.revature.challenge.problems.two.ProblemTwo;

import java.util.Arrays;

public class MainChallengeAgo02ProblemTwo {

    public static void main(String[] args){
        int max = 100;
        int min=0;
        int[] array = new int[max];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)((Math.random())*max) +min;
        }

        ProblemTwo.minAndMaxValuesFromArray(array);
    }

}
