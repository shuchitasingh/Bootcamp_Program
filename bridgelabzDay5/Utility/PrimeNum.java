package com.bridgelabzDay5.Utility;
import java.util.Scanner;

public class PrimeNum {
	 public static void main(String[] args) {
	        System.out.println("Enter a number to check if its prime or not: ");
	        Scanner scan = new Scanner(System.in);
	        int number = scan.nextInt();

	        MathFunction.isPrime(number);
	    }
}
