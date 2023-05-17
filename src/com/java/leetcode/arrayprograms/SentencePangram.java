package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class SentencePangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence1 = "leetcode";
        boolean res = new SentencePangram().checkIfPangram(sentence);
        System.out.println("Sentence is pangram " + res);
    }

    // BRUTEFORCE APPROACH
    public boolean checkIfPangram(String sentence) {
        boolean[] charArray = new boolean[26];
        for (int index = 0; index < sentence.length(); index++) {
            charArray[sentence.charAt(index) - 97] = true;                  // a=97
        }

        for (int index = 0; index < 26; index++) {
            if(charArray[index] == false) {
                return false;
            }
        }
        return true;
    }

    // BITWISE OPERATOR
    public boolean checkIfPangram1(String sentence) {
        int res = 0;            // all 32 bits will be zero
        for (int i = 0; i < sentence.length(); i++) {
            res = res | ( (1 << sentence.charAt(i)) - 1);
            if (res == ( (1 << 26) - 1)) {
                return true;
            }
        }
        return false;
    }

}
