package com.bridgelabz;

import java.util.Scanner;

public class FactorialNum {
	 public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		   int num;
		      System.out.println("Enter a number:");
		      num=cs.nextInt();
		      int fact=1;
		      for(int i=1;i<=num;i++)
		          fact=fact*i;
		      System.out.println("The factorial is "+fact);
		  cs.close();
		 }
}
