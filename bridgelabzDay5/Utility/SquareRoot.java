package com.bridgelabzDay5.Utility;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
        System.out.println("Enter a number to find its square root: ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();

        double d = MathFunction.squareRoot(number);
        System.out.println(d);
    }
}
