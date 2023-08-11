package com.nt.niranjana.apractice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator Application");
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] numberStrings = input.split("\\s+");
        double[] numbers = new double[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Double.parseDouble(numberStrings[i]);
        }

        double result = add(numbers);
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }

    public static double add(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }
}

