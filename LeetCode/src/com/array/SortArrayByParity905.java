package com.array;

/*
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 

 */
public class SortArrayByParity905 {
	public static void main(String[] args) {

	}

	public int[] sortArrayByParity(int[] A) {
		int[] B = new int [A.length];
		int left = 0;
		int right = A.length - 1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0)
				B[left++] = A[i];
			else
				B[right--] = A[i];

		}
		return B;

	}
}
