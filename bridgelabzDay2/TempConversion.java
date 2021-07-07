package com.bridgelabzDay2;
import java.util.Scanner;

public class TempConversion {
	 public static void main(String[] args) {
	        System.out.println("Select an option " +
	                "1. C to F" +
	                "2. F to C");
	        Scanner scan = new Scanner(System.in);
	        int choice = scan.nextInt();
	        if (choice == 1) {
	            System.out.println("Enter the temperature in C");
	            double c = scan.nextInt();
	            System.out.println("The temperature is " + Utility.temperatureConversionToF(c) + "F");
	        }
	        else if (choice == 2) {
	            System.out.println("Enter the temperature in F");
	            double f = scan.nextInt();
	            System.out.println("The temperature is " + Utility.temperatureConversionToC(f) + "C");
	        }
	    }
}
