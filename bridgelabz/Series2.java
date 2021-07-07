package com.bridgelabz;

import java.util.Scanner;

public class Series2 {
	public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		  int n,x,i,fact=1;
		  double result;
		  System.out.println("Enter the n and x Value:");
		  n=cs.nextInt();
		  x=cs.nextInt();
		  for(i=1;i<=n;i++)
		  {
		   fact*=i;
		  }
		  result=Math.pow(x,n)/fact;
		  System.out.println("Result(x^n/n!)= "+result);
		  cs.close();
		 }

}
