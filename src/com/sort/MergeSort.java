package com.sort;

public class MergeSort {
	// �鲢�����㷨
	public static void mergeSort(int[] a, int n) {
		mergeSortInternally(a, 0, n - 1);
	}

	// �ݹ���ú���
	private static void mergeSortInternally(int[] a, int p, int r) {
		// TODO Auto-generated method stub
		// �ݹ���ֹ����
		if (p >= r)
			return;
		// ȡp��r֮����м�λ��q,��ֹ��p+r���ĺͳ���int�������ֵ
		int q = p + (r - p) / 2;

		// ���εݹ�
		mergeSortInternally(a, p, q - 1);
		mergeSortInternally(a, q + 1, r);
		// �ϲ�
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

		// �ж��ĸ�����������ʣ�������
		int start = i;
		int end = q;
		if (j <= r) {
			start = j;
			end = r;
		}

		// ��ʣ������ݿ�������ʱ������
		while (start <= end) {
			temp[k++] = a[start++];
		}
		
		for(i=0;i<=r-p;i++){
			a[p+i]=temp[i];
		}

	}
}
