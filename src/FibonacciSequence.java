
public class FibonacciSequence {
	public static void main(String[] args) {
		int num = 0;
		int num1 = 1;
		System.out.println(num1);
		for (int i = 0; i < 11; i++) {
			int num3 = num + num1;
			System.out.println(num3);
			num = num1;
			num1 = num3;

			
		}
	
		}

	}
	/*******************************************************************************
	 * Copyright (c) The League of Amazing Programmers 2013-2017 Level 0
	 * Fibonacci sequence Duration=00 Platform=Eclipse Type=Teacher
	 * Objectives=Challenging logic
	 * 
	 * 
	 ******************************************************************************/

	/**
	 * Print the first 12 numbers of the Fibonacci sequence 0, 1, 1, 2, 3, 5, 8,
	 * 13, 21, 34, 55, 89, 144
	 */


