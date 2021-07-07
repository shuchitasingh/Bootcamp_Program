package com.bridgelabzDay3;

import java.util.Scanner;
import java.util.Random;

public class Utility {
	//Method for Prime number calculation
    public static void primeNumber(int low, int high) {
        while (low < high) {
            boolean flag = true;

            for (int i = 2; i <= low / 2; i++) {
                if (low % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true)
                System.out.print(low + " ");

            low++;
        }
    }

    //Method for Die calculation that prints repeated numbers of faces
    public static void rollDie(int times) {
        int[] arr = new int[times];
        int maxCounter = 0;
        int element = 0;
        Random random = new Random();
        for (int i = 0; i < times; i++) {
            arr[i] = random.nextInt(6) + 1;
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (maxCounter < counter) {
                maxCounter = counter;
                element = arr[i];
            }
        }
        System.out.println("Face of die repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
    }


    //Method to print the second largest number in an array
    public static void secondLargest(int[] arr, int arr_size) {

        int i, first, second;


        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        int largest = second = Integer.MIN_VALUE;


        for (i = 0; i < arr_size; i++) {
            largest = Math.max(largest, arr[i]);
        }


        for (i = 0; i < arr_size; i++) {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        if (second == Integer.MIN_VALUE)
            System.out.println("There is no second " +
                    "largest element\n");
        else
            System.out.println("The second largest " +
                    "element is \n" + second);
    }

    //Method to print the second smallest number in an array
    public static void secondSmallest(int[] arr, int arr_size) {

        int i, first, second;


        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        int smallest = second = Integer.MAX_VALUE;


        for (i = 0; i < arr_size; i++) {
            smallest = Math.min(smallest, arr[i]);
        }


        for (i = 0; i < arr_size; i++) {
            if (arr[i] != smallest)
                second = Math.min(second, arr[i]);
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second " +
                    "smallest element\n");
        else
            System.out.println("The second smallest " +
                    "element is \n" + second);
    }

    //Second method for the above program
    public static void secondLargestAndSmallest(int[] arr, int total) {
        total = arr.length;
        int temp;

        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The second smallest of the array is: " + arr[1]);
        System.out.println("The second largest of the array is: " + arr[arr.length - 2]);
    }

    //Method to find out the factors of the input number
    public static void primeFactors(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.println(i);
                number = number / i;
            }
        }
    }

    //Method for checking and printing the duplicate value in the given array
    public static void checkDuplicate(int[] arr, int size) {
        System.out.println("The input array is: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    System.out.println("The repeated number is: " + arr[j]);
                else
                    System.out.println("No repeats");
                break;
            }
        }
    }

    //Method to show the conversion from decimal to binary number
    public static void binary(int number)
    {
        int[] binary = new int[100];
        int i = 0;
        while(number != 0)
        {
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }
        System.out.println("The binary value is: ");
        for (int j = i - 1; j >= 0 ; j--) {
            System.out.print(binary[j]);
        }
    }

	
	}



