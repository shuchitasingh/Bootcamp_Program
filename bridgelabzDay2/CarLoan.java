package com.bridgelabzDay2;
import java.util.Scanner;

public class CarLoan {
	 public static void main(String[] args) {
	        System.out.println("Enter the value of Principal loan: ");
	        Scanner scan = new Scanner(System.in);
	        int pLoan = scan.nextInt();
	        System.out.println("Enter the number of years: ");
	        int year = scan.nextInt();
	        System.out.println("Enter the rate of interest: ");
	        int rate = scan.nextInt();

	        Utility.carLoan(pLoan,year,rate);
	    }
}
