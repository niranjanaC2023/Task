package com.nt.niranjana.javaOops04082023;

public class VehicleMainClass 
{
	public static void main(String[] args) 
	{
		Vehicle carVehicle = new Car();
		carVehicle.model="Hyundai i20";
		System.out.println("Car Model "+carVehicle.model);
		carVehicle.make="Hyundai Company";
		System.out.println("Car Make Company "+carVehicle.make);
		carVehicle.start();
		carVehicle.stop();
		System.out.println();
		
		Vehicle motorVehicle = new MotorCycle();
		motorVehicle.model="Pulshar 250";
		System.out.println("MotorCycle Model "+motorVehicle.model);
		motorVehicle.make="Honda Company";
		System.out.println("MotorCycle Make Company "+motorVehicle.make);
		motorVehicle.start();
		motorVehicle.stop();
	}
}
