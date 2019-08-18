package com.niuke;

import java.util.Scanner;

public class longTo1 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        long a = sc.nextLong();
	        String str = Long.toBinaryString(a);
	        int count = 0;
	        for(char ch:str.toCharArray()){
	            if(ch=='1') count++;
	        }
	        System.out.println(count);
	    }
}
