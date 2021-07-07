package com.bridgelabz;

import java.util.Scanner;

public class Series1 {
	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
		int n,i,fact=1;
        double result;
	System.out.println("Enter the n value:");
	n=cs.nextInt();
	for(i=1;i<=n;i++)
	{

		fact*=i;

	}
        result=1.0/fact;
     System.out.println("1/n! = "+result);
	
		cs.close();

	}
}
