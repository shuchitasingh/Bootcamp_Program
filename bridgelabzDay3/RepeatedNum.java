package com.bridgelabzDay3;
import java.util.Scanner;

public class RepeatedNum {
	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] rev = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            }
        System.out.println("New array: ");
        for (int i = arr.length-1; i>=0 ; i--) {
            System.out.println(arr[i]);
        }
        }

}
