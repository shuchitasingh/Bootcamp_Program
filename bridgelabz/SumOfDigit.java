package com.bridgelabz;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
	      Scanner cs=new Scanner(System.in);
	      int n;
	      System.out.println("Enter a number:");
	      n=cs.nextInt();
	      int sum=0;
	      while(n!=0)
	      {
	          int rem=n%10;
	          sum=sum+rem;
	          n=n/10;
	      }
	        System.out.println("The sum of digits of the number is "+sum);
	      cs.close();
	 }
	
}
