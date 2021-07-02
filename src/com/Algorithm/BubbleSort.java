package com.Algorithm;

public class BubbleSort {
	/**
	 * sort down is public static method Using to sort the integer values
	 * intializing n has integer
	 * 
	 * @param a is an int which is holding integer values
	 * @param n initializing size of int a
	 */

	public static void sortdown(int[] a) {
		int n = a.length;
		for (int i = 0; i <= n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	/**
	 * main method
	 * 
	 * @param args - argument, its an actual value that are passed to variables
	 *             Prints the sorted value
	 */

	public static void main(String[] args) {
		int[] a = { 5, 8, 1, 6, 9, 2, 7 };
		sortdown(a);
		for (int x : a) {
			System.out.println(x);
		}
	}

}
