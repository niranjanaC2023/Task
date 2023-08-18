/*Question 7: Create a Java program that takes a string containing mathematical expressions (e.g., "3 + 5 * 2") and 
evaluates the expression to return the result.
*/

package com.nt.niranjana.javalogicalquestion;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class GetResultFromMathematicalExpression 
{
	public static double convertNumStringToDouble(String expression)
	{
		 ScriptEngineManager manager = new ScriptEngineManager();
	      ScriptEngine engine = manager.getEngineByName("js"); // JavaScript engine

	        try {
		            Object evalResult = engine.eval(expression);
		            if (evalResult instanceof Number) 
		            {
		                return ((Number) evalResult).doubleValue();
		            } 
		            else 
		            {
		                System.out.println("Invalid expression.");
		            }
	          } 
	        catch (ScriptException e) 
	        {
	            System.out.println("Error evaluating the expression: " + e.getMessage());
	        }

	        return Double.NaN; // Indicates an invalid or unsuccessful evaluation
	 }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mathematical expression: ");
        String expression = scanner.nextLine();

        double result = convertNumStringToDouble(expression);

        System.out.println("Result: " + result);
    }
}
