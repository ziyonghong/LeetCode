package com.array1;

import java.util.Arrays;

/*
Hash Table:
将每个数字仿佛哈希表中，记数，直到某个数的count>n/2。时间复杂度为o(n)。
排序:
因为众数是出现次数大于n/2的数字，所以排序之后中间的那个数字一定是众数。即nums[n/2]为众数。
时间复杂度即排序的时间复杂度。
分治法:
分治法是将整个问题化简为一个一个的小问题去解，将数组分成简单的几部分，比如讲一组数分为两部分，
第一部分的众数如果等于第二部分的众数，则这个数就是上一层那一组的众数，如果第一部分不等于第二部分，
则遍历这一组数，记录这两个数的出现频率，返回为频率最大的，如果频率相同，返回谁都无所谓，
因为在这里众数x肯定存在的，那么肯定会有至少两个x相连，如果不相连的话，那最后一个数字肯定是众数x。
（例如：1 2 1 2 1 2 1，12112）。时间复杂度为o(n)。

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
			if (left == right)// 左右两部分的众数相同 则这个数是这部分的众数
				return left;
			else {// 左右两部分的众数不相同 则这两个数都有可能是这部分的众数
					// 那么遍历这个数组 看一下哪个数字的出现频率高
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