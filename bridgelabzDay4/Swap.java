package com.bridgelabzDay4;

public class Swap {
	 public static void main(String[] args) {
	        int fno = 10;
	        int sno = 20;
	        int temp = 0;

	        System.out.println("Before swapping :" +fno +" " + sno);
	        temp =fno;
	        fno = sno;
	        sno = temp;

	        System.out.println("Swapped values: " +fno + " " + sno);
	    }
}
