package com.leetcode.code75;

/*
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.



Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
*/

public class Greatest_Common_Divisor_Of_Strings {

    public static String gcdOfStrings(String str1, String str2) {
        /*String resultString = "";
        if(str1.equals(str2))
            resultString = str1;
        else if(str1.startsWith(str2)){
            resultString = str1.substring(str2.length());
            if(resultString.length() > str2.length() && resultString.startsWith(str2)){
                resultString = resultString.substring(str2.length());
            }
        }
        return resultString;*/

        // 2nd approach

        if(str2.length() > str1.length())
            return gcdOfStrings(str2, str1);
        if(str1.equals(str2))
            return str1;
        if(str1.startsWith(str2))
            return gcdOfStrings(str1.substring(str2.length()), str2);
        return "";
    }

    public static void main(String[] args) {
        System.out.println(Greatest_Common_Divisor_Of_Strings.gcdOfStrings("ABABAB", "AB"));
    }

}
