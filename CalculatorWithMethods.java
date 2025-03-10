package com.myFirstclass;
import java.io.PrintStream;
import java.util.*;
	public class CalculatorWithMethods {
	    public static double add(double a, double b) {
	        return a + b;
	    }

	    public static double subtract(double a, double b) {
	        return a - b;
	    }

	    public static double multiply(double a, double b) {
	        return a * b;
	    }

	    public static double divide(double a, double b) {
	        if (b != 0) {
	            return a / b;
	        } else {
	            System.out.println("Division by zero is not allowed.");
	            return Double.NaN;
	        }
	    }
	    public static double remainder(double a, double b) {
	        if (b != 0) {
	            return a % b;
	        } else {
	            System.out.println("Error: Modulo by zero is not allowed.");
	            return Double.NaN;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();
	        
	        System.out.println("Select an operation:");
	        System.out.println("1Addition");
	        System.out.println("2Subtraction");
	        System.out.println("3Multiplication");
	        System.out.println("4Division");
	        System.out.println("5Remainder");

	        System.out.print("Enter your choice (1-5)");
	        int choice = scanner.nextInt();

	        double result = 0;
	        boolean validOperation = true;
	        switch (choice) {
	            case 1:
	                result = add(num1, num2);
	                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
	                break;
	            case 2:
	                result = subtract(num1, num2);
	                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
	                break;
	            case 3:
	                result = multiply(num1, num2);
	                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
	                break;
	            case 4:
	                result = divide(num1, num2);
	                if (!Double.isNaN(result))
	                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
	                else
	                    validOperation = false;
	                break;
	            case 5:
	                result = remainder(num1, num2);
	                if (!Double.isNaN(result))
	                    System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
	                else
	                    validOperation = false;
	                break;
	            default:
	                System.out.println("wrong choice Please select a number between 1 and 5.");
	                validOperation = false;
	        }
	      
	

	       
	    }
	}



