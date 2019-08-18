package com.array1;

public class TwoSumII167 {

	// 两个指针
	public int[] twoSum(int[] numbers, int target) {
		int a[] = new int[2];
		int i = 0, j = numbers.length - 1;
		while (i < j) {
			int x = numbers[i] + numbers[j];
			if (x < target)
				i++;
			else if (x > target)
				j--;
		}
		a[0] = i;
		a[1] = j;
		return a;

	}

	/*
	 * // 二分查找 public int[] twoSum(int[] numbers, int target) { // Assume input
	 * is already sorted. for (int i = 0; i < numbers.length; i++) { int j =
	 * bsearch(numbers, target - numbers[i], i + 1); if (j != -1) { return new
	 * int[] { i + 1, j + 1 }; } } throw new IllegalArgumentException(
	 * "no tow sum solution");
	 * 
	 * }
	 * 
	 * private int bsearch(int[] a, int key, int start) { int l = start, r =
	 * a.length - 1; while (l < r) { int m = (l + r) / 2; if (a[m] < key) l = m
	 * + 1; else r = m; } return (l == r && a[l] == key) ? l : 0; }
	 */
}
