package com.bridgelabzDay6;

import java.util.Arrays;

public class ArrayEvenOdd {
	public static void main(String[] args) {
        int[] arr = {2,7,6,4,5,9,2,13};
        int temp = 0 ;


        System.out.println("Ordered: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] % 2 == 0)
                {
                    if (arr[i] > arr[j])
                    {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
            Arrays.sort(arr,0,arr.length/2);
            System.out.println(arr[i]);
            }
    }

}
