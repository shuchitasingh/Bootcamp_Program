package com.bridgelabzDay5.Utility;

public class MissingNum {
	 public static void main(String[] args) {


	        int arr[] = {1, 2,  4, 5, 6, 9, 10};

	        int diff = arr[0];

	        int miss = 0;
	        int store = 0;
	        int multiply = 1;

	        System.out.println("The missing elements are: ");

	        for (int i = 0; i < arr.length; i++) {


	            if (arr[i] - i != diff) {


	                while (diff < arr[i] - i) {
	                    store = i + diff;
	                    System.out.println(store);

	                    diff++;
	                    multiply *= store;
	                }
	            }
	        }
	        System.out.println("The product is: ");
	        System.out.println(multiply);

	    }
}
