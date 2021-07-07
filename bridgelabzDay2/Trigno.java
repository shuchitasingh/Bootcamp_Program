package com.bridgelabzDay2;
import java.util.Scanner;

public class Trigno {
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the angle (degree)");
	        double angle = scan.nextInt();
	        Utility.trig(angle);
	    }
}
