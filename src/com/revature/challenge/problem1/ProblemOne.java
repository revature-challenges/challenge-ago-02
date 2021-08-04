package com.revature.challenge.problem1;

import java.util.Arrays;
import java.util.function.BiFunction;

public class ProblemOne {

    public static void main(String[] args) {
        String strA = "Minneapolis";
        String strA2 = "Mnneapolis";
        String strB = "Minnesota";
        String strA3 = "Minnesotapolis";
        String strB2 = "Mnneapolis";

       //To use this BiFunction strOne must be the longest string of the inputs
        BiFunction<String, String, Integer> longestCommonSubsequence = (strOne, strTwo) -> {
            int[] subsequences = new int[strOne.length()];
            for (int i = 0; i < strOne.length(); i++) {
                int count = 0;
                for (int j = 0; j < strOne.length(); j++) {
                    if (j >= strTwo.length()){
                        break;
                    }
                    if (strOne.charAt(j) == strTwo.charAt(j)) {
                        count++;
                    } else {
                        subsequences[i] = count;
                    }
                }

            }
            Arrays.sort(subsequences);
            return Arrays.stream(subsequences).max().getAsInt();
        };

//        System.out.println("The longest common subsequence for the words >> strA: " + strA + " and strB: " + strB + " is >>> " + longestCommonSubsequence.apply(strA, strB));

//        System.out.println("The longest common subsequence for the words >> strA: " + strA + " and strB: " + strB + " is >>> " + longestCommonSubsequence.apply(strA2, strB));

        System.out.println("The longest common subsequence for the words >> strA: " + strA + " and strB: " + strB + " is >>> " + longestCommonSubsequence.apply(strA3, strB2));

    }
}
