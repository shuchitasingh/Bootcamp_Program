package com.bridgelabzDay5.Utility;

import java.util.Scanner;

public class Factorial {
	 public static void main(String[] args) {
	        System.out.println("Enter a number: ");
	        Scanner scan = new Scanner(System.in);
	        int number = scan.nextInt();

	        int factorial = MathFunction.factorial(number);
	        System.out.println("The factorial of the number is: " + factorial);
	    }
}
