package com.bridgelabzDay3;

import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.IOException;

public class Binary {
	 public static void main(String[] args) throws IOException {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a decimal number: ");
	        int number = scan.nextInt();

	        Utility.binary(number);
	    }
}
