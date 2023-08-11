package com.nt.niranjana.javaexceptionquestion08082023;


public class Question6MainClasss {

    public static int convertStringToInt(String input)
    {
        try 
        {
        	int num = Integer.parseInt(input);
		System.out.println(num+" Is a valid integer");
			return num;
        }
        catch (NumberFormatException e) 
        {
            System.out.println("String cannot convert to integer, pass integer value");
            return 0;
        }
    }

    public static void main(String[] args) 
    {
        String input1 = "123";
        String input2 = "abc";

        int numberIs = convertStringToInt(input1);
        System.out.println("numberIs: " + numberIs);
        
        int stringAsDefaultValue = convertStringToInt(input2);
        System.out.println("String default value: " + stringAsDefaultValue);
    }
}
