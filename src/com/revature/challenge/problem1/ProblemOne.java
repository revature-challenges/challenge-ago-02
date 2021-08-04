package com.revature.challenge.problem1;

import java.util.Arrays;
import java.util.function.BiFunction;

public class ProblemOne {

    public static void main(String[] args) {
        String strA = "Minneapolis";
        String strB = "Minnesota";

        BiFunction<String, String, Integer> longestCommonSubsequence = (strOne, strTwo) -> {
            int[] subsequences = new int[strOne.length()];
            for (int i = 0; i < strOne.length(); i++) {
                int count = 0;
                for (int j = i; j < strTwo.length(); j++) {
                    if (strOne.charAt(j) == strTwo.charAt(j)) {
                        count++;
                    } else {
                        break;
                    }
                }
                subsequences[i] = count;
            }
            Arrays.sort(subsequences);
            return Arrays.stream(subsequences).max().getAsInt();
        };

        System.out.println("The longest common subsequence for the words >> strA: " + strA + " and strB: " + strB + " is >>> " + longestCommonSubsequence.apply(strA, strB));

    }
}
