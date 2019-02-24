package com.string;

public class ReverseString344 {
	public String reverseString(String s) {
		char word[] = s.toCharArray();
		int i = 0, j = s.length() - 1;
		while (i < j) {
			char t = word[i];
			word[i] = word[j];
			word[j] = t;
		}
		return new String(word);
	}
}
