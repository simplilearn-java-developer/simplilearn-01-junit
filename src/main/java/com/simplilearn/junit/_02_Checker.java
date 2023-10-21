package com.simplilearn.junit;

public class _02_Checker {

    boolean isPalindrome(String str) {

        /*
         * A Palindrome is a string with reverse is equal to the original string.
         */

        StringBuilder stb = new StringBuilder(str);

        String rev = stb.reverse().toString();

        return str.equals(rev);
    }
}
