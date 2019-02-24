package com.string;
/*
 * Isomorphic Strings Í¬¹¹×Ö·û´®
 * For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
 */
public class IsomorphicStrings205 {
	 public boolean isIsomorphic(String s, String t) {
		 int m1[]=new int[256], m2[]=new int[256],n=s.length();
	        for (int i = 0; i < n; i++) {
				if(m1[s.charAt(i)]!=m2[t.charAt(i)]) return false;
				m1[s.charAt(i)]=i+1;
				m2[s.charAt(i)]=i+1;
			}
			return true;
	        
	    }
}
