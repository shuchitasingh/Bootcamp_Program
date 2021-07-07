package com.bridgelabzDay3;

import java.util.Scanner;

public class RollDice {
	 public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the number of times the dice rolls: ");
	        int times = scan.nextInt();

	        Utility.rollDie(times);
	    }
}
