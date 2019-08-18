package com.array;
/*
 * 单调数列
 */
public class MonotonicArray896 {
	 public boolean isMonotonic(int[] A) {
		if(in(A)||en(A))
			return true;
		return false;
		
		 }
	 public boolean in(int[]A){
		 for(int i=0;i<A.length;i++){
			 if(!(A[i]<=A[i+1]))
				 return false;
		 }
		return true;
	 }
		 public boolean en(int[]A){
			 for(int i=0;i<A.length;i++){
				 if(!(A[i]>=A[i+1]))
					 return false;
			 }
			return true;
		 }
			
}
