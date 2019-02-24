package com.array1;

/*
 * 贪心算法，只要股票赚钱了就卖
 */
public class BestTimeToBuyandSellStock122 {
	public int maxProfit(int[] prices) {
		int temp = 0, result = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i + 1] > prices[i]) {
				temp = prices[i + 1] - prices[i];
				result += temp;
			}
		}
		return result;

	}
}
