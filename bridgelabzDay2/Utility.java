package com.bridgelabzDay2;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	 public static double windChill(double t, double v) {
	        double w = 0;
	        if ((t < 50) || v < 120) {
	            w = (35.74 + 0.6215 * t + (0.4275 * t - 35.75)) * Math.pow(v, 0.16);
	        }
	        return w;
	    }

	  
	    public static void trig(double number) {
	        System.out.println("The Radian is " + Math.toRadians(number));
	        System.out.println("The sin angle is " + Math.sin(number));
	        System.out.println("The cos angle is " + Math.cos(number));
	        System.out.println("The tan angle is" + Math.tan(number));
	    }
	  //Method for Stat5 Calculation which prints 5 random numbers and prints the smallest and largest of them
	    public static void stat5() {
	        double random1 = Math.random();
	        double random2 = Math.random();
	        double random3 = Math.random();
	        double random4 = Math.random();
	        double random5 = Math.random();
	        System.out.println("Random number 1 : " + random1);
	        System.out.println("Random number 2 : " + random2);
	        System.out.println("Random number 3 : " + random3);
	        System.out.println("Random number 4 : " + random4);
	        System.out.println("Random number 4 : " + random5);

	        System.out.println("The smallest number from the above random numbers ");
	        System.out.println(Math.min(random5, Math.min(random4, Math.min(random3, (Math.min(random1, random2))))));

	        System.out.println("The largest number from the above random numbers");
	        System.out.println(Math.max(random5, Math.max(random4, Math.max(random3, (Math.max(random1, random2))))));
	    }
	  //Method for Flip coin Simulator
	    public static void FlipCoin() {
	        Random r = new Random();
	        int random = r.nextInt(2);
	        if (random == 1) {
	            System.out.println("Heads");
	        } else
	            System.out.println("Tails");
	    }

	    //Method for Power of 2 calculation
	    public static int PowerOf2(int input) {
	        int result = 1;
	        for (int i = 1; i <= input; i++) {
	            result *= 2;
	        }
	        return (result);
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

	    //Method for Gambling Simulator
	    public static void gamblingSimulator(int stake, int goal, int trail) {
	        int random;
	        int win = 0;
	        int loss = 0;
	        boolean loop = true;
	        while (loop) {
	            Random r = new Random();
	            random = r.nextInt(2);
	            if (random == 1) {

	                win++;
	                System.out.println("placed a bet and won ");
	                stake++;
	                if (stake == goal) {
	                    System.out.println("congrats you have won ");
	                    loop = false;
	                }
	            } else {
	                loss++;
	                System.out.println("placed a bet and lost");
	                stake--;
	                if (stake == trail) {
	                    System.out.println("sorry you lost");
	                    loop = false;
	                }

	            }

	        }
	        System.out.println("Total number of wins: " + win);
	        System.out.println("Total number of losses: " + loss);
	        System.out.println("Total number of times placed bets are: " + (win + loss));
	    }

	    //Method for show Gregorian Calender
	    public static void dayOfWeek(int month, int day, int year) {
	        int year0 = year - (14 - month) / 12;
	        int x = year0 + (year0 / 4) - (year0 / 100) + (year0 / 400);
	        int month0 = month + 12 * ((14 - month) / 1200) - 2;

	        if (month0 == 1) {
	            System.out.println("January");
	        } else if (month0 == 2) {
	            System.out.println("February");
	        } else if (month0 == 3) {
	            System.out.println("March");
	        } else if (month0 == 4) {
	            System.out.println("April");
	        } else if (month0 == 5) {
	            System.out.println("May");
	        } else if (month0 == 6) {
	            System.out.println("June");
	        } else if (month0 == 7) {
	            System.out.println("July");
	        } else if (month0 == 8) {
	            System.out.println("August");
	        } else if (month0 == 9) {
	            System.out.println("September");
	        } else if (month0 == 10) {
	            System.out.println("October");
	        } else if (month0 == 11) {
	            System.out.println("November");
	        } else if (month0 == 12) {
	            System.out.println("December");
	        }


	        int day0 = (day + x + 31 * (month0 / 12)) % 7;

	        if (day0 == 0) {
	            System.out.println("Sunday ");
	        } else if (day0 == 1) {
	            System.out.println("Monday ");
	        } else if (day0 == 2) {
	            System.out.println("Tuesday ");
	        } else if (day0 == 3) {
	            System.out.println("Wednesday ");
	        } else if (day0 == 4) {
	            System.out.println("Thursday ");
	        } else if (day0 == 5) {
	            System.out.println("Friday ");
	        } else if (day0 == 6) {
	            System.out.println("Saturday ");
	        }

	        System.out.println(year0);

	    }

	    //Method to show the calculations for car loan payment
	    public static void carLoan(int loan, int year, int rate)
	    {
	        double payment = 0;
	        double n = 12 * year;
	        double rate0 = rate / (12 * 100 );
	        payment = (loan * rate0) / Math.pow((1 - (1 + rate0)),-n);
	        System.out.println("Your total payment: " + payment);
	    }

	    //Method to show calculations for sqrt using newtons method
	    public static void sqrt(double c)
	    {
	        double t = 1;
	        t = (c/t + t) / 2;
	        double epsilon = 1 ;

	        while( t > 0 )
	        {
	            Math.abs(t - c/t);
	            epsilon = 1 * epsilon - 15;
	            System.out.println(t);
	        }
	    }
	        //Method for Temperature conversion
	        public static double temperatureConversionToF(double c) {
	            double result = 0;
	            result = (c * 9 / 5) + 32;

	            return result;
	        }

	        public static double temperatureConversionToC(double f) {
	            double result = 0;
	            result = (f - 32) * 5 / 9;

	            return result;
	        }
	    
}
