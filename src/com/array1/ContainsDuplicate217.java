package com.array1;

import java.util.Arrays;

/*
 * ������ǰ���������Ƿ�һ����֪�����������Ƿ����һ��������
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
