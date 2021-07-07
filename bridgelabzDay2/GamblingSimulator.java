package com.bridgelabzDay2;
import java.util.Scanner;

public class GamblingSimulator {
	 public static void main(String[] args) {
	        System.out.println("Enter the number of stake");
	        Scanner scan = new Scanner(System.in);
	        int stake = scan.nextInt();
	        System.out.println("Enter your goal ");
	        int goal = scan.nextInt();
	        System.out.println("Enter the trail or the limit ");
	        int trail = scan.nextInt();

	        Utility.gamblingSimulator(stake,goal,trail);
	    }
}
