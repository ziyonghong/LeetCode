package com.array1;

import java.util.Arrays;

/*
Hash Table:
��ÿ�����ַ·��ϣ���У�������ֱ��ĳ������count>n/2��ʱ�临�Ӷ�Ϊo(n)��
����:
��Ϊ�����ǳ��ִ�������n/2�����֣���������֮���м���Ǹ�����һ������������nums[n/2]Ϊ������
ʱ�临�Ӷȼ������ʱ�临�Ӷȡ�
���η�:
���η��ǽ��������⻯��Ϊһ��һ����С����ȥ�⣬������ֳɼ򵥵ļ����֣����署һ������Ϊ�����֣�
��һ���ֵ�����������ڵڶ����ֵ��������������������һ����һ��������������һ���ֲ����ڵڶ����֣�
�������һ��������¼���������ĳ���Ƶ�ʣ�����ΪƵ�����ģ����Ƶ����ͬ������˭������ν��
��Ϊ����������x�϶����ڵģ���ô�϶�������������x����������������Ļ��������һ�����ֿ϶�������x��
�����磺1 2 1 2 1 2 1��12112����ʱ�临�Ӷ�Ϊo(n)��

 */
public class MajorityElement169 {
	public int majorityElement(int[] nums) {
		return find(nums, 0, nums.length - 1);
	}

	public static int find(int[] nums, int begin, int end) {
		if (begin == end)
			return nums[begin];
		else {
			int mid = (begin + end) / 2;
			int left = find(nums, begin, mid);
			int right = find(nums, mid + 1, end);
			if (left == right)// ���������ֵ�������ͬ ����������ⲿ�ֵ�����
				return left;
			else {// ���������ֵ���������ͬ �������������п������ⲿ�ֵ�����
					// ��ô����������� ��һ���ĸ����ֵĳ���Ƶ�ʸ�
				int countleft = 0;
				int countright = 0;
				for (int i = begin; i <= end; i++)
					if (nums[i] == left)
						countleft++;
					else if (nums[i] == right)
						countright++;
				if (countleft > countright)
					return left;
				else
					return right;
			}
		}
	}

}
/*
 * public int majorityElement(int[] nums) { Arrays.sort(nums); return
 * nums[nums.length/2];
 * 
 * }
 */