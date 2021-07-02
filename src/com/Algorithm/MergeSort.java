package com.Algorithm;

public class MergeSort {

	public static void main(String[] args) {

		String[] a = { "King", "Panda", "Soldiers", "Dancing", "Flowering", "Cat", "Mum-Mum", "Joyfull", "In-out" };
		String[] b = { "Marvel", "Kitty", "Miracle", "Money", "Hello", "Zoom-zoom", "Crying", "Bubbles", "Amazing",
				"Rose", "Magnet" };
		String[] c = new String[a.length + b.length];
		mergeSort(a);
		mergeSort(b);
		merge(c, a, b);
		mergeSort(c);
		// Arrays.sort(names);
		for (String arr : c) {
			System.out.println(arr);
		}
	}

	public static void mergeSort(String[] c) {
		if (c.length > 1) {
			String[] a = new String[c.length / 2];
			String[] b = new String[c.length - c.length / 2];
			for (int i = 0; i < a.length; i++) {
				a[i] = c[i];
			}
			for (int j = 0; j < b.length; j++) {
				b[j] = c[j + c.length / 2];
			}
			mergeSort(a);
			mergeSort(b);
			merge(c, a, b);// calling merge method
		}
	}

	public static void merge(String[] name, String[] left, String[] right) {
		int as = 0;
		int bs = 0;
		for (int i = 0; i < name.length; i++) {
			if (bs >= right.length || (as < left.length && left[as].compareToIgnoreCase(right[bs]) < 0)) {
				name[i] = left[as];
				as++;
			} else {
				name[i] = right[bs];
				bs++;
			}
		}
	}
}