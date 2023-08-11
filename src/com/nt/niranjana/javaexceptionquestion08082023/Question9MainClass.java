package com.nt.niranjana.javaexceptionquestion08082023;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question9MainClass
{
	public static void readFileFromUser(String getFileFromUser) 
	{
		System.out.println("This is readFileFromUser method");
		File file = new File(getFileFromUser);	
		try(FileInputStream fileInputStream = new FileInputStream(file))
		{
			System.out.println("Inside try block");
			int content;
       
			while ((content = fileInputStream.read()) != -1) 
			{
			    System.out.print((char) content);
			}
		}
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}			
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name or path ");
        String userSendingInfo = scanner.nextLine();
		readFileFromUser(userSendingInfo);
	}

}
