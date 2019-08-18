package com.array;

/*
 * Example 1:

Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class FlippinganImage832 {
	public static void main(String[] args) {

	}

	public int[][] flipAndInvertImage(int[][] A) {
		int[][] B = null;
		int i, j = 0, k = 0;
		for (i = 0; i < A.length; i++) {
			for (j = A[i].length; j > 0; j--) {
				for (k = 0; k < A[i].length; k++)
					B[i][k] = A[i][j];
				if (B[i][k] == 1)
					B[i][k] = 0;
				else
					B[i][k] = 1;
			}
		}
		return B;
	}
}
