package com.array1;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers628 {
public int maximumProduct(int[] nums) {
	Arrays.sort(nums);
	int i=0;
	int j =nums.length-1;
	int count =0;
	int result = 0;
	//�����������ĩβ��Ԫ��С�ڵ���0�����ʾ�������鶼Ϊ��ֵ
	//��ô�˻�������������������ĩβ
	if(nums[j] <=0){
		if(count <3){
			result = nums[j] * nums[j-1]*nums[j-2];
			count++;
		}		
	}
	//���������ĩβ��Ԫ�ش���0�����ʾ����������ܰ�����ֵ�͸�ֵ
	//��������ĩβԪ���⣬��������Ԫ�ؿ���������ĩβ���֣����������鿪ʼ����
	else{
	    //���鿪ʼ�����������˻�
		int valueOfFront = nums[i] * nums[i+1];
		//����ĩβ�������˻�
		int valueOfBehind = nums[j-1] * nums[j-2];
		//�����ʼ���ֵĳ˻�����ĩβ���ֵĳ˻�
		if(valueOfFront > valueOfBehind){
			result = nums[j]* valueOfFront;
		}else{
			result = nums[j] * valueOfBehind;
		}
	}				
	return result;
        
    }
}
