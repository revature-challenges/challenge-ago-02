package com.revature.challenge.problems;

import com.revature.challenge.problems.one.ProblemOne;

public class MainChallengeAgo02 {

    public static void main(String[] args){
        String strA = "Minneapolis";
        String strB = "Minnesota";
        String strA2 = "Mnneapoli";
        String strB2 = "Minnesota";
        String strA3 = "Minnesotapolis";
        String strB3 = "Mnneapolis";

        System.out.println("The longest common subsequence for the words >> strA: " + strA + " and strB: " + strB + " is >>> " + ProblemOne.longestCommonSubsequence(strA, strB));
        System.out.println("The longest common subsequence for the words >> strA: " + strA2 + " and strB: " + strB2 + " is >>> " + ProblemOne.longestCommonSubsequence(strA2, strB2));
        System.out.println("The longest common subsequence for the words >> strA: " + strA3 + " and strB: " + strB3 + " is >>> " + ProblemOne.longestCommonSubsequence(strA3, strB3));
    }

}
