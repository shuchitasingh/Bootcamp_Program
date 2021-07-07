package com.bridgelabz;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		  int num;
		     System.out.println("Enter a number:");
		     num=cs.nextInt();
		     int num1=num;
		     int num2=0;
		     while(num!=0)
		     {
		         int rem=num%10;
		         num/=10;
		         num2=num2*10+rem;
		     }

		     if(num1==num2)
		         System.out.println("It is Palindrome");
		     else
		         System.out.println("It is not Palindrome");
		  cs.close();
		 }
}