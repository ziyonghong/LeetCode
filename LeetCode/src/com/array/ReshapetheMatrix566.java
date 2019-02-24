package com.array;

public class ReshapetheMatrix566 {
	 public int[][] matrixReshape(int[][] nums, int r, int c) {
		 int r1=nums.length;
		 int c1=nums[0].length;
		 if(r1*c1==r*c){
			 int [][]result=new int[r][c];
			 for(int i=0;i<r1*c1;i++)
			result[i/c][i%c]=nums[i/c1][i%c1];	 
			 return result;
		 }
		return nums;
	        
	    }
}
