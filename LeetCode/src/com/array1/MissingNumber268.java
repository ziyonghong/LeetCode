package com.array1;
/*
 * ����ڴӡ�0...n�������飬������ȱ����һ��������ô�������0...n��������ĺͣ�
 * �ټ�ȥ����������ĺͣ���ôȱ�ٵ����ͳ����ˡ�
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
