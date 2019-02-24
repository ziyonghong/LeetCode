package com.DynamicProgramming;

public class MatrixTraversal {

	public static int getTraversal(int m, int n) {
		int num = 0;
		if (m == 1 && n == 1)
			return 1;
		if (m > 1)
			num += getTraversal(m - 1, n);
		if (n > 1)
			num += getTraversal(m, n - 1);

		return num;
	}

	public static void main(String[] args) {
		System.out.println(getTraversal(4, 5));
	}
}
