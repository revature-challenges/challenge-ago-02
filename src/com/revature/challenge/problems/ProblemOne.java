package com.revature.challenge.problems;

import java.util.Arrays;
import java.util.function.BiFunction;

public class ProblemOne {

    public static void main(String[] args) {
        String strA = "Minneapolis";
        String strB = "Minnesota";
        String strA2 = "Mnneapolis";
        String strB2 = "Minnesota";
        String strA3 = "Minnesotapolis";
        String strB3 = "Mnneapolis";


        BiFunction<String, String, Integer> longestCommonSubsequence = (strOne, strTwo) -> {
            String longest;
            String shortest;


            if(strOne.length() >= strTwo.length()){
                longest = strOne;
                shortest = strTwo;

            }else{
                longest = strTwo;
                shortest = strOne;
            }

            int dif= longest.length() - shortest.length();
            int[] subsequences = new int[longest.length()];
            String tempStr;
            if (dif > 0){
                tempStr = longest.substring(0,shortest.length());
                for (int i = 0; i < shortest.length(); i++) {
                    int count = 0;
                    for (int j = 0; j < tempStr.length(); j++) {
                        if (shortest.charAt(j) == tempStr.charAt(j)) {
                            count++;
                        } else if(count > 0) {
                            subsequences[i] = count;
//                            count=0;
                        }
                    }
                    subsequences[i] = count;
                }
                tempStr = longest.substring(dif);
                for (int i = 0; i < shortest.length(); i++) {
                    int count = 0;
                    for (int j = 0; j < tempStr.length(); j++) {
                        if (shortest.charAt(j) == tempStr.charAt(j)) {
                            count++;
                        } else if(count > 0){
                            subsequences[i] = count;
//                            count=0;
                        }
                    }
                    subsequences[i] = count;
                }
            }else{
                tempStr = shortest;
                for (int i = 0; i < shortest.length(); i++) {
                    int count = 0;
                    for (int j = 0; j < tempStr.length(); j++) {
                        if (shortest.charAt(j) == tempStr.charAt(j)) {
                            count++;
                        } else if(count > 0){
                            subsequences[i] = count;
//                            count=0;
                        }
                    }
                    subsequences[i] = count;
                }
            }
            Arrays.sort(subsequences);
            return Arrays.stream(subsequences).max().getAsInt();
        };

        System.out.println("The longest common subsequence for the words >> strA: " + strA + " and strB: " + strB + " is >>> " + longestCommonSubsequence.apply(strA, strB));

        System.out.println("The longest common subsequence for the words >> strA: " + strA2 + " and strB: " + strB2 + " is >>> " + longestCommonSubsequence.apply(strA2, strB));

        System.out.println("The longest common subsequence for the words >> strA: " + strA3 + " and strB: " + strB3 + " is >>> " + longestCommonSubsequence.apply(strA3, strB3));

    }
}
