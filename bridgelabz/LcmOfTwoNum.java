package com.bridgelabz;

import java.util.Scanner;

public class LcmOfTwoNum {
	 public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		  int num1,num2;
		     System.out.println("Enter two number to find L.C.M:");
		     num1=cs.nextInt();
		     num2=cs.nextInt();
		     int n1=num1;
		     int n2=num2;
		     while(num1!=num2)
		     {
		        if(num1>num2)
		           num1=num1-num2;
		        else
		           num2=num2-num1;
		     }
		     int lcm=(n1*n2)/num1;
		     System.out.println("The L.C.M is "+lcm);
		  cs.close();
		 }
}
