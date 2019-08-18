package com.array;

public class MaxConsecutiveOnes485 {
	 public int findMaxConsecutiveOnes(int[] nums) {
		 int max=0,cur=0;
		 for(int i=0;i<nums.length-1;i++)
			 if(nums[i]==1)
				 cur++;
		 if(cur>max)
			 max=cur;
		return max;
	        
	    }
}
