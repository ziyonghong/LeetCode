package com.array1;

import java.util.Arrays;

/*
 * 先排序看前后两个数是否一样就知道该数组中是否存在一样的数了
 */
public class ContainsDuplicate217 {
public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]==nums[i+1])
				return true;
			
		}
        return false;
    }
}
