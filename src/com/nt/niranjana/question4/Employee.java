package com.nt.niranjana.question4;

public class Employee {

	String name;
	int id;
	double salary;
	double percentage;
	double bonus;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		
	}
	void calculateBonus(double percentage)
	{
		bonus = salary*percentage/100;
		System.out.println("Bonus amount is: "+bonus);
		//salary = salary-bonus;
		//System.out.println("Net salary is: "+salary);
	}
	
	void empDetails()
	{
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee ID: "+this.id);
		System.out.println("Employee SALARY: "+this.salary);
		System.out.println("Employee BONUS: "+this.bonus);
	}
	
	
}
