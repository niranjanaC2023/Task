package com.nt.niranjana.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeClassTest {
	
	public static void main(String[] args) {
		double salary;
		double percentage;
		double bonus;
		Scanner scn = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter Employee Name: ");
		emp.setName(scn.nextLine());
		
		System.out.println("Enter Employee ID: ");
		emp.setId(scn.nextInt());
		
		System.out.println("Enter Employee Salary: ");
		emp.setSalary(scn.nextDouble());
		
		System.out.println("Enter Employee Salary Percentage: ");
	    percentage = scn.nextDouble();
	   
	   emp.calculateBonus(percentage);
	   System.out.println("Salary is: "+emp.getSalary());
	   System.out.println();
	   
	   emp.empDetails();
	   
	// Create an array of employees and apply the bonus to each employee.
	   Employee emp1 = new Employee("Radhe",101,20000.00);
	   Employee emp2 = new Employee("shyam",102,30000.00);
	   Employee emp3 = new Employee("vikram",103,40000.00);
	   Employee emp4 = new Employee("leo",104,50000.00);
	   
	   List<Employee> list = new ArrayList<>();
	   list.add(emp1);
	   list.add(emp2);
	   list.add(emp3);
	   list.add(emp4);
	   
	   System.out.println();
	   
	   if(list.get(0).getSalary()>=20000  && list.get(0).getSalary()<30000)
	   {
		   bonus = (list.get(0).getSalary()*20)/100;
			System.out.println("Bonus amount added: "+bonus);
	   }
	    if(list.get(1).getSalary()>=30000  && list.get(1).getSalary()<40000)
	   {
		   bonus = (list.get(1).getSalary()*30)/100;
			System.out.println("Bonus amount added: "+bonus);
	   }
	    if(list.get(2).getSalary()>=40000  && list.get(2).getSalary()<50000)
	   {
		   bonus = (list.get(2).getSalary()*50)/100;
			System.out.println("Bonus amount added: "+bonus);
	   }
	   		
	}

}
