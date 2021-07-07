package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturals {
	public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		     int n;
		     System.out.println("Enter the N value:");//Take input number of natural number 
		     n=cs.nextInt();
		    
		      //Compute sum of the n natural number
		     int sum=0;
		     for(int i=1;i<=n;i++)
		     {
		       sum=sum+i;
		     }
		       
		       System.out.println("The sum of n natural numbers is "+sum);
		  cs.close();
		 }
	
}
