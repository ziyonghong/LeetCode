package com.array1;
/*
 * 相比于从【0...n】的数组，该数组缺少了一个数，那么计算出【0...n】的数组的和，
 * 再减去待计算数组的和，那么缺少的数就出来了。
 */
public class MissingNumber268 {
	 public int missingNumber(int[] nums) {
		  int ret = nums.length;
	        for (int i = 0; i < nums.length; i++) {
	            ret += (i - nums[i]);
	        }
	        return ret;

	        
	    }
}
