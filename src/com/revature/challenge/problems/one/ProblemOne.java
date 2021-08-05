package com.revature.challenge.problems.one;

import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;

public class ProblemOne {

    public static int longestCommonSubsequence(String strOne, String strTwo){
        String longest;
        String shortest;
        Set<Integer> results = new HashSet<>();

        if(strOne.length() >= strTwo.length()){
            longest = strOne;
            shortest = strTwo;

        }else{
            longest = strTwo;
            shortest = strOne;
        }

        for (int i = 0; i <= shortest.length(); i++) {
            for (int j = i+2; j <= shortest.length(); j++) {
                String strA = shortest.substring(i,j);
                if(!longest.contains(strA)) break; // || strA.equals("")) break;
                for (int k = 0; k <= longest.length(); k++) {
                    for (int l = k+2; l <= longest.length(); l++) {
                        String strB = longest.substring(k,l);
                        int dif = strB.length() - strA.length();
                        if (dif == 0) {
                            results.add(lcsSameLength(strA, strB));
                        } else {
                            for (int m =0 ; m <= dif; m++) {
                                int endSupport = m+strA.length();
                                String supportB = strB.substring(m,endSupport);
                                results.add(lcsSameLength(strA,supportB));
                            }
                        }
                    }
                }
            }
        }

        OptionalInt max = results.stream().mapToInt(num -> num).max();

        return max.getAsInt();
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
}
