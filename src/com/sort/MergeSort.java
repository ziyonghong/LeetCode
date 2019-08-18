package com.sort;

public class MergeSort {
	// 归并排序算法
	public static void mergeSort(int[] a, int n) {
		mergeSortInternally(a, 0, n - 1);
	}

	// 递归调用函数
	private static void mergeSortInternally(int[] a, int p, int r) {
		// TODO Auto-generated method stub
		// 递归终止条件
		if (p >= r)
			return;
		// 取p到r之间的中间位置q,防止（p+r）的和超过int类型最大值
		int q = p + (r - p) / 2;

		// 分治递归
		mergeSortInternally(a, p, q - 1);
		mergeSortInternally(a, q + 1, r);
		// 合并
		merge(a, p, q, r);
	}

	private static void merge(int[] a, int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int k = 0;
		int[] temp = new int[r - p + 1];
		while (i <= q && j <= r) {
			if (a[i] <= a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}

		// 判断哪个子数组中有剩余的数据
		int start = i;
		int end = q;
		if (j <= r) {
			start = j;
			end = r;
		}

		// 将剩余的数据拷贝到临时数组中
		while (start <= end) {
			temp[k++] = a[start++];
		}
		
		for(i=0;i<=r-p;i++){
			a[p+i]=temp[i];
		}

	}
}
