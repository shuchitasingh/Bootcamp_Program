package com.bridgelabzDay5.Utility;
import java.util.Scanner;

public class sinAngle {
	 public static void main(String[] args) {
	        System.out.println("Enter a number: ");
	        Scanner scan = new Scanner(System.in);
	        int number = scan.nextInt();

	        System.out.println(MathFunction.sinAngleCalculation(number));
	    }
}
