package com.DynamicProgramming;

public class ClimbingStairs70 {
	  public int climbStairsMemorization(int n) {
//	       if(n<0) return 0;
//	       if(n==1) return 1;
//	       int mo=climbStairsMemorization(n-1);
//	       int mt=climbStairsMemorization(n-2);
//	       return mo+mt;
		  
		  if (n == 0 || n == 1 || n == 2) return n;
	        int []dp=new int[n+1];
	        dp[0] = 1;
	        dp[1] = 1;
	        for (int i = 2; i <= n; i++){
	            dp[i] = dp[i-1] + dp[i-2];
	        }
	        
	        return dp[n];
	    }
}
