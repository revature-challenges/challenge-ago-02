package com.revature.challenge.problems.two;

import java.util.Arrays;

public class ProblemTwo {

    public static void minAndMaxValuesFromArray(int[] array){
        System.out.println("This is the Array >>> "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("The min values is >> "+array[0]);
        System.out.println("The max values is >> "+array[array.length-1]);

    }


}
