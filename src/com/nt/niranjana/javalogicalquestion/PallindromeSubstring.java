/*
 Question 6: Write a Java function to count and return the number of palindrome substrings in a given string. For 
example, in the string "ababa", the palindrome substrings are "a", "b", "a", "b", "a", "aba", "bab", so 
the output should be 7.
 */


package com.nt.niranjana.javalogicalquestion;

public class PallindromeSubstring 
{
    public static int countPalindromeSubstrings(String str) 
    {
        int count = 0;
        int length = str.length();

        // Loop through each character as a possible center of a palindrome
        for (int center = 0; center < length; center++) {
            // For odd length palindromes
            int left = center;
            int right = center;
            while (left >= 0 && right < length && str.charAt(left) == str.charAt(right)) {
                count++;
                left--;
                right++;
            }

            // For even length palindromes
            left = center;
            right = center + 1;
            while (left >= 0 && right < length && str.charAt(left) == str.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "kbkbbk";
        int result = countPalindromeSubstrings(str);
        System.out.println("Number of palindrome substrings: " + result);
    }
}
