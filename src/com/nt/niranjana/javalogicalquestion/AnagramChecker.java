/*
 Question 5: You are given two strings. Write a Java program to determine if the two strings are anagrams of each 
other. An anagram of a string is another string that uses the same characters, but can be arranged 
into a different order.

Anagram means: one word is derived from another word with same lenghth.
Ex: Was ->Saw, Fast->Fats, Are-->Ear   ...etc
 */

package com.nt.niranjana.javalogicalquestion;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for accurate comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "Are";
        String str2 = "Ear";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
