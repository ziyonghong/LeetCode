package com.DynamicProgramming;

public class MinCostClimbingStairs746 {
//	public int minCostClimbingStairs(int[] cost) {
//        for (int i = 2; i < cost.length; i++) {
//            cost[i] += Math.min(cost[i-1], cost[i-2]);
//        }
//        return Math.min(cost[cost.length-1], cost[cost.length-2]);
//    }
	
	public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int []dp=new int[n];
        dp[0]=0;dp[1]=0;
        for (int i = 2; i <n; i++) {
			dp[i]=Math.min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1]);
		}
        return Math.min(dp[n-2]+cost[n-2],dp[n-1]+cost[n-1]);
    }
}
