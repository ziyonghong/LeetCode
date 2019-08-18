package com.array;

import java.util.Arrays;
/*
 * 贪心法求两两一组的数中的最大和
 */
public class ArrayPartitionI_561 {
public int arrayPairSum(int[] nums) {
	//对数组进行排序
	Arrays.sort(nums);
	int sum=0;
	for(int i=0;i<nums.length;i=i+2)
		sum+=nums[i];
	return sum;
        
    }
}
