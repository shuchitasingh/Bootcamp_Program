package com.bridgelabzDay3;
import java.util.Scanner;

public class ComputeFactor {
	  public static void main(String[] args) {
	        System.out.println("Enter the number: ");
	        Scanner scan = new Scanner(System.in);
	        int number = scan.nextInt();

	        System.out.println("The factors are: ");
	        Utility.primeFactors(number);
	    }
}
