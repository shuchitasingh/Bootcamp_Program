package com.bridgelabzDay6;

public class StopWatch {
	 public void display() {
	        System.out.println("Calculating Method execution time:");
	    }

	    public static void main(String[] args) {

	        StopWatch obj = new StopWatch();


	        long start = System.nanoTime();


	        obj.display();


	        long end = System.nanoTime();


	        long execution = end - start;
	        System.out.println("Execution time: " + execution + " nanoseconds");
	    }
}
