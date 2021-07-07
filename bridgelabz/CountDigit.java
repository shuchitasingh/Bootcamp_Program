package com.bridgelabz;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		   int n,count=0;
		      System.out.println("Enter a number:");
		      n=cs.nextInt();
		      while(n!=0)
		      {
		          n=n/10;
		          count++;
		      }
		   System.out.println("The number of digits in the number is "+count);
		  cs.close();
		 }
}
