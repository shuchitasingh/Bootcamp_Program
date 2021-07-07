package com.bridgelabz;

import java.util.Scanner;

public class PrimeNum {
	 public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		  int num,i;
		     System.out.println("Enter a number:");
		     num=cs.nextInt();
		     System.out.println("Prime Factors of "+num+" are");
		     while(num%2==0)
		     {
		         System.out.print("2 ");
		         num=num/2;
		     }
		     for(i=3;i<=Math.sqrt(num);i=i+2)
		     {
		         while(num%i==0)
		         {
		             System.out.print(i+" ");
		             num=num/i;
		         }
		     }
		    if(num>2)
		      System.out.print(num+" ");
		  cs.close();
		 }
		
}
