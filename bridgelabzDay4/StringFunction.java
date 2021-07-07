package com.bridgelabzDay4;
import java.util.Scanner;

public class StringFunction {
	  public static void main(String[] args) {
	        System.out.println("Enter first String: ");
	        Scanner scan = new Scanner(System.in);
	        String str = scan.next();
	        System.out.println("Enter the second String: ");
	        String str2 = scan.next();

	        Utility.checkAnagram(str,str2);
	    }
}
