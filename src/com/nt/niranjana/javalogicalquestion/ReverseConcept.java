/*
 Question 4: You are given a string that represents a sentence. Write a Java function to reverse the order of 
words in the sentence. For example, the input "Hello world, how are you?" should produce "you? 
are how world, Hello
 */


package com.nt.niranjana.javalogicalquestion;

public class ReverseConcept
{
//    public static String reverseWords(String sentence) {
//        // Split the sentence into words using space as delimiter
//        String[] words = sentence.split("\\s+");
//        
//        // Create a StringBuilder to build the reversed sentence
//        StringBuilder reversed = new StringBuilder();
//        
//        // Append words in reverse order to the StringBuilder
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]);
//            if (i > 0) {
//                reversed.append(" "); // Add a space between words
//            }
//        }
//        
//        return reversed.toString();
//    }
	public static String reverseWords(String sentence)
	{
		StringBuilder reversed = new StringBuilder(sentence);
		reversed.reverse();
		return reversed.toString();
	}

    public static void main(String[] args) 
    {
        String inputSentence = "Hi I am Niranjana";
        String reversedSentence = reverseWords(inputSentence);
        
        System.out.println("Original Sentence: " + inputSentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}
