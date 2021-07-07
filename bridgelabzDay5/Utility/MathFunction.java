package com.bridgelabzDay5.Utility;

public class MathFunction {
	 //Method for square root calculation
    public static double squareRoot(double c) {
        double temp;
        double sqrt = c / 2;

        do {
            temp = sqrt;
            sqrt = (temp + (c / temp)) / 2;
        }
        while ((temp - sqrt) != 0);

        return sqrt;
    }

    //Method for Harmonic number
    public static double harmonicNumber(int number) {
        double result = 0;
        for (int i = 1; i <= number; i++) {
            System.out.print("1/" + i + " + ");
            result += (float) 1 / i;
        }
        return result;
    }

    //Method for sin angle calculation
    public static double sinAngleCalculation(double number)
    {
        double calculation = Math.sin(number);
        return calculation;
    }

    //Method for cosine angle calculation
    public static double cosineAngleCalculation(double number)
    {
        double calculation = Math.cos(number);
        return calculation;
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

    //Method to check whether a number is prime or not
    public static boolean isPrime(int number)
    {
        int counter = 0;
        boolean check = true;
        if (number == 1)
            System.out.println("Composite number");
        else if (number == 0)
            System.out.println("Put a number greater than 2 ");
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    counter++;
            }
            if (counter > 0) {
                System.out.println(check = false);
            } else
                System.out.println(true);
        }

        return check;
    }

    //Method to print factorial of a number
    public static int factorial(int number)
    {
        int factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
