package com.leetcode.code75;

import java.util.Stack;

public class Reverse_Vowels_of_a_String {

    public static String reverseVowels(String s) {
        Stack<Character> characters = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
                s = s.replace(c, '1');
                characters.push(c);
            }
        }
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1')
                s = s.replaceFirst(String.valueOf(s.charAt(i)), characters.pop().toString());
        }

        return s;

    }

    public static void main(String[] args) {
        System.out.println(Reverse_Vowels_of_a_String.reverseVowels("aA"));
    }

}
