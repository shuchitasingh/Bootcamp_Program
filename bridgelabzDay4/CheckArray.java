package com.bridgelabzDay4;

public class CheckArray {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6};
	        int store = 0, storenew;
	        int rem = 0;
	        int reverse = 0;
	        for (int i = 1; i < arr.length; i = i + 2) {
	            store += arr[i];

//	            System.out.println(arr[i]);
	        }
	        storenew = store * 10;
	        System.out.println("the new number is : " + storenew);

	        boolean loop = true;
	        while (storenew>0) {
//	        for (int i = 0; i <4 ; i++) {


	            rem = storenew % 10;
	            reverse = reverse * 10 + rem;
	            storenew /= 10;

//	        }


	        }
	        System.out.print("The reversed number is : " + reverse);
	            if (store == reverse)
	                System.out.println(storenew + " is palindrome ");
	            else
	                System.out.println(storenew + " not a palindrome ");
	        }
}
