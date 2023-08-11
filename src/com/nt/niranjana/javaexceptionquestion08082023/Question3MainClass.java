package com.nt.niranjana.javaexceptionquestion08082023;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Question3MainClass
{

	public static void readFileFromUser(String getFileFromUser) 
	{
		System.out.println("This is readFileFromUser method");
		File file = new File(getFileFromUser);	
		try
		{
			System.out.println("Inside try block");
			FileInputStream fileInputStream = new FileInputStream(file);
			int content;
            try
            {
				while ((content = fileInputStream.read()) != -1) 
				{
				    System.out.print((char) content);
				}
			} 
            catch (IOException e) 
            {
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}			
	}
	
	public static void main(String[] args) throws IOException 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name or path ");
        String userSendingInfo = scanner.nextLine();

        readFileFromUser(userSendingInfo);
	}
}
