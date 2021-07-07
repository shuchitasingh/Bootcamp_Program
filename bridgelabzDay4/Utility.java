package com.bridgelabzDay4;

import java.util.Arrays;

public class Utility {
	//Method to check if two Strings are anagram of each other or not
    public static void checkAnagram(String s1, String s2)
    {
        boolean match = true;
        if (s1.length() != s2.length()) {
            match = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            match = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (match) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    //Method to check if the given Strings are palindrome or not
    public static void checkPalindrome(String str)
    {
        String rev = "";

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
    //Method for Calender operations
    public static int findMaxDay(String monthName, int y) {
        String months[] = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int D[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0))) {
            D[2] = 29;
        }
        int max = 0;
        for (int i = 1; i <= 12; i++) {
            if (monthName.equalsIgnoreCase(months[i])) {
                max = D[i];
            }
        }
        return max;
    }

    public static int findDayNo(String weekName) {
        String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int f = 0;
        for (int i = 0; i < 7; i++) {
            if (weekName.equalsIgnoreCase(days[i])) {
                f = i;
            }
        }
        return f;
    }

    public static void fillCalendar(int max, int f, String monthName, int y) {
        int A[][] = new int[6][7];
        int x = 1, z = f;

        for (int i = 0; i < 6; i++) {
            for (int j = f; j < 7; j++) {
                if (x <= max) {
                    A[i][j] = x;
                    x++;
                }
            }
            f = 0;
        }

        for (int j = 0; j < z; j++)
        {
            A[0][j] = A[5][j];
        }

        printCalendar(A, monthName, y);
    }

    static void printCalendar(int A[][], String monthName, int y) {
        System.out.println("\n\t----------------------------------------------------");
        System.out.println("\t\t\t   " + monthName + " " + y);
        System.out.println("\t----------------------------------------------------");
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        System.out.println("\t----------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (A[i][j] != 0)
                    System.out.print("\t " + A[i][j]);
                else
                    System.out.print("\t ");
            }
            System.out.println("\n\t----------------------------------------------------");
        }
    }
}
