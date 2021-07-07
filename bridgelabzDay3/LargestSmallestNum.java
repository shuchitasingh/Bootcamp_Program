package com.bridgelabzDay3;
import java.util.Scanner;

public class LargestSmallestNum {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the size of the array: ");
	        int size = scan.nextInt();

	        int arr[] = new int[size];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scan.nextInt();
	        }

	        Utility.secondLargest(arr, size);
	        Utility.secondSmallest(arr, size);

	        System.out.println("Using second method to find the second largest and smallest for the given array: ");
	        Utility.secondLargestAndSmallest(arr, size);
	    }
}
