package com.bridgelabzDay5.Utility;

import java.io.IOException;
import java.util.Scanner;

public class Binary {
	public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int number = scan.nextInt();

        MathFunction.binary(number);
    }
}
