package com.array;

import java.util.Arrays;
/*
 * ̰�ķ�������һ������е�����
 */
public class ArrayPartitionI_561 {
public int arrayPairSum(int[] nums) {
	//�������������
	Arrays.sort(nums);
	int sum=0;
	for(int i=0;i<nums.length;i=i+2)
		sum+=nums[i];
	return sum;
        
    }
}
