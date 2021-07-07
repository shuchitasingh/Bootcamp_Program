package com.bridgelabzDay4;

import java.util.Scanner;

public class CheckPalindrom {
	  public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = sc.nextLine();
	        Utility.checkPalindrome(str);

	    }
}
