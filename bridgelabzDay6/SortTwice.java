package com.bridgelabzDay6;

import java.util.Arrays;

public class SortTwice {
	  public static void main(String[] args) {

	        int[] arr = {2,1,6,4,3,5,2,12,7,10,13,16};
	        int odd = 0;
	        int left = 0;
	        int right = arr.length - 1;
	        int temp = 0;

	        while ( left < right )
	        {
	            while( arr[left] % 2 != 0)
	            {
	                odd++;
	                left++;
	            }

	            while (arr[right] % 2 == 0)
	            {
	                right--;
	            }

	            if (left < right)
	            {
	                temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	            }
	        }

	        Arrays.sort(arr,0,odd);
	        Arrays.sort(arr,odd,arr.length);

	        System.out.println(Arrays.toString(arr));

	    }
}
