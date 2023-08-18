/*
 Question 8: Write a Java function to perform a case-insensitive search and replace of all occurrences of a specific 
word in a given sentence with another word.
 */
package com.nt.niranjana.javalogicalquestion;

public class ReplaceSourceByTraget 
{
    public static String replaceWithcasesensitive(String existingData, String sourceData, String replaceData)
    {
        String pattern = "(?i)" + sourceData; // (?i) is used for search case-insensitive
           
        // replacement happens source to target
        String finallyReplacedWithNewData = existingData.replaceAll(pattern, replaceData);
        
        return finallyReplacedWithNewData;
    }

    public static void main(String[] args) 
    {
        String existingData = "On August 15 Independence Day.On Independence Daya Our PM hoisted the indian flag at Red Fort in NewDelhi";
        String sourceData = "Independence";
        String replaceData = "INDEPENDENCE";

        String finallyReplacedWithNewData = replaceWithcasesensitive(existingData, sourceData, replaceData);
        System.out.println("Original Sentence: " + existingData);
        System.out.println("Modified Sentence: " + finallyReplacedWithNewData);
    }
}
