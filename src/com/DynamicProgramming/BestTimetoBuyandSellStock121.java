package com.DynamicProgramming;

public class BestTimetoBuyandSellStock121 {
	 public int maxProfit(int[] prices) {
	        if(prices==null||prices.length<1)
	        	return 0;
	        int min=prices[0];
	        int maxP=0;
	        for (int i = 1; i < prices.length; i++) {
				if(prices[i]-min<=0)
					min=prices[i];
				else
				{
					if(maxP<prices[i]-min)
						maxP=prices[i]-min;
				}
			}
			return maxP;
	    }

	
}
