package com.divideAndConquer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DifferentWaystoAddParentheses241 {
	// public List<Integer> diffWaysToCompute(String input) {
	//
	// List<Integer> res = new ArrayList<Integer>();
	// for (int i = 0; i < input.length(); i++) {
	// char ch = input.charAt(i);
	// if (ch == '+' || ch == '-' || ch == '*') {
	// List<Integer> left = diffWaysToCompute(input.substring(0, i));
	// List<Integer> right = diffWaysToCompute(input.substring(i + 1,
	// input.length()));
	// for (int l : left) {
	// for (int r : right) {
	// switch (ch) {
	// case '+':
	// res.add(l + r);
	// break;
	// case '-':
	// res.add(l - r);
	// break;
	// case '*':
	// res.add(l * r);
	// break;
	//
	// }
	// }
	// }
	// }
	// }
	// if (res.size() == 0)
	// res.add(Integer.valueOf(input));
	// return res;
	// }

	private HashMap<String, List<Integer>> hm = new HashMap<String, List<Integer>>();

	public List<Integer> diffWaysToCompute(String input) {
		if (hm.containsKey(input))
			return hm.get(input);
		List<Integer> ways = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*')
				for (Integer l : diffWaysToCompute(input.substring(0, i)))
					for (Integer r : diffWaysToCompute(input.substring(i + 1, input.length())))
						if (ch == '+')
							ways.add(l + r);
						else if (ch == '-')
							ways.add(l - r);
						else
							ways.add(l * r);
		}
		if (ways.size() == 0)
			ways.add(Integer.valueOf(input));
		hm.put(input, ways);
		return ways;
	}

}
