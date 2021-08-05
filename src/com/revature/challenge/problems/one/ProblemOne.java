package com.revature.challenge.problems.one;

import java.util.HashSet;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

public class ProblemOne {

    public static int longestCommonSubsequence(String strOne, String strTwo){
        String longest;
        String shortest;
        int result=0;

        if(strOne.length() >= strTwo.length()){
            longest = strOne;
            shortest = strTwo;

        }else{
            longest = strTwo;
            shortest = strOne;
        }

        int dif = longest.length() - shortest.length();

        if(dif == 0){
             return lcsSameLength(longest, shortest);
        }else{
             return lcsDifLength(longest,shortest,dif);
        }

    }

    private static int lcsSameLength(String strA, String strB){
        int count=0;
        Set<Integer> results = new HashSet<>();
        for (int i = 0; i < strA.length(); i++) {
            if(strA.charAt(i)==strB.charAt(i)){
                count++;
                if(i==strA.length()-1){
                    results.add(count);
                }
            }else{
                results.add(count);
                count=0;
            }
        }

        OptionalInt max = results.stream().mapToInt(num -> num).max();

        return max.getAsInt();
    }

    private static int lcsDifLength(String longest, String shortest, int dif){
        int count=0;
        Set<Integer> results = new HashSet<>();
        for (int i = 0; i < dif; i++) {
            String temp = longest.substring(i, shortest.length()-1);
            results.add(lcsSameLength(shortest, temp));
        }
        OptionalInt max = results.stream().mapToInt(num -> num).max();

        return max.getAsInt();
    }
}

