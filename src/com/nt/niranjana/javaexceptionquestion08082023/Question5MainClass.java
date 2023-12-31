package com.nt.niranjana.javaexceptionquestion08082023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Question5MainClass 
{
	public static void main(String[] args)
	{
			Scanner scn=null;
			Connection con=null;
		   Statement st=null;
			int no=0;
			String query=null; 
			ResultSet rs=null;
			try 
			{
				scn=new Scanner(System.in);
				if(scn!=null) 
				{
					System.out.println("Enter Employee number");
					no=scn.nextInt();
				}
				//register jdbc driver s/w (optonal)
				//Class.forName("com.mysql.jdbc.Driver");
				//establish the connection
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projecteidiko","root","root");
				 
				 //create statement object
				 if(con!=null)
					 st=con.createStatement();
				 //prepare SQL Query
				   query="SELECT SNO,SNAME,SADDRS,SSAL FROM  STUDENTS WHERE SNO="+no;
				   //send and execute in DB s/w 
				   if(st!=null)
					   rs=st.executeQuery(query);
				   //process the ResultSet obj
				   if(rs!=null)
				   {
					    if(rs.next())
		                      System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"   "+rs.getFloat(4));			    	
					    else
					    	System.out.println("No records found");
				   }

			}//try
			catch(SQLException se) 
			{ 
				se.printStackTrace();
			}
			catch(Exception e) 
			{  
				e.printStackTrace();
			}
			finally 
			{
				//close jdbc objs
				try 
				{
					if(rs!=null)
						rs.close();
				}
				catch(SQLException se) 
				{
					se.printStackTrace();
				}
				try 
				{
					if(st!=null)
						st.close();
				}
				catch(SQLException se) 
				{
					se.printStackTrace();
				}
				
				try 
				{
					if(con!=null)
						con.close();
				}
				catch(SQLException se) 
				{
					se.printStackTrace();
				}
				
				try 
				{
					if(scn!=null)
						scn.close();
				}
				catch(Exception e) 
				{
					e.printStackTrace();
				}
				
			}//finally
		}
}
