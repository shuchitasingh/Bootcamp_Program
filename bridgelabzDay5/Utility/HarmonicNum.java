package com.bridgelabzDay5.Utility;
import java.util.Scanner;

public class HarmonicNum {
	 public static void main(String[] args) {
	        System.out.println("Enter the n th term : ");
	        Scanner scan = new Scanner(System.in);
	        int number = scan.nextInt();

	        if (number <= 0) {
	            System.out.println("Provide a number greater then zero");
	        } else {
	            System.out.println("The result of the harmonic progression is " + MathFunction.harmonicNumber(number));
	        }
	    }
}
