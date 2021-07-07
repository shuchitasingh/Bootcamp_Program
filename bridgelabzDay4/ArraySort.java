package com.bridgelabzDay4;

public class ArraySort {
	 public static void main(String[] args) {
	        int[] arr = {9,5,6,1,2,4,3,7,2};
	        System.out.println("The unsorted array: ");

	        int temp = 0;
	        for (int i = 0; i < arr.length ; i++) {
	            System.out.println(arr[i]);
	        }

	        for (int i = 0; i < arr.length ; i++) {
	            for (int j = i + 1; j < arr.length ; j++) {
	                if (arr[i] > arr[j]) {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        System.out.println("Sorted array: ");
	        for (int i = 0; i < arr.length ; i++) {
	            System.out.println(arr[i]);
	        }
	        System.out.println(arr[arr.length - 2]);
	    }
}
