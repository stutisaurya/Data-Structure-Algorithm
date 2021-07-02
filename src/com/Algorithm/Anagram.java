package com.Algorithm;

public class Anagram {
	public static String removeSpaces(String str) {

		char[] ch = str.toCharArray();

		String nstring = " ";

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				nstring = nstring + ch[i];

			}
		}
		return nstring;
	}

	public static String toLowerCase(String str) {

		char[] ch = str.toCharArray();// converting the string into array

		String nstr = " ";// creating a new empty string

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				nstr = nstr + ((char) ch[i] + 32);
			}

			else {
				nstr = nstr + ch[i]; // if it is in lower case no need to convert
			}
		}
		return nstr;
	}

	/**
	 * sort is a method of public static sort method is used to sorting the string
	 * in alphabetical order First converting string to array sorting string into
	 * alphabetical order
	 * 
	 * @param str
	 * @return sorted string
	 */
	public static String sort(String str) {

		char[] ch = str.toCharArray();// converting string to array
		// sort string in alphabetical order
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char t = ch[i];
					ch[i] = ch[j];
					ch[j] = t;
				}
			}
		}
		String st = new String(ch);
		return st;
	}

	/**
	 * compare is a method of public static type Used compare method to compare two
	 * strings or words First it compares the length after arranging words in
	 * sorting form if length is not equal
	 * 
	 * @param s2 2nd word
	 * @return if both words are equal return false, if equal return true
	 * @param s1 1st word
	 */
	public static boolean compare(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			s1 = toLowerCase(s1);
			s2 = toLowerCase(s2);
			s1 = sort(s1);
			s2 = sort(s2);
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string");
		String s2 = sc.nextLine();
		s1 = removeSpaces(s1);
		s2 = removeSpaces(s2);
		boolean b = compare(s1, s2);
		if (b)
			System.out.println("string	is anagram");
		else
			System.out.println("not an	anagram");
	}
}
