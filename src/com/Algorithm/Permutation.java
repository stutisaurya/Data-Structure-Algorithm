package com.Algorithm;

public class Permutation {
	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();// to find length
		Permutation per = new Permutation();
		per.calculate(str, 0, n - 1);// this means we calculate permutation for entire
	}

	private void calculate(String str, int left, int right) {
		if (left == right) {
			System.out.println(str); // it will print string
		} else {
			for (int i = left; i <= right; i++) {

				String swapped = this.swap(str, left, i);
				this.calculate(swapped, left + 1, right);// using recursion concept
			}
		}
	}

	public String swap(String a, int i, int j) {

		char temp;// temp Will be used later for swapping
		char[] charArray = a.toCharArray();// converting string to charector array by using toCharArray
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);// returning our string charector
	}
}
