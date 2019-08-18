package com.array1;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIII170 {
private Map<Integer,Integer> table=new HashMap<>();
public void add(int input){
	int count=table.containsKey(input)?table.get(input):0;
	table.put(input, count+1);
}
public boolean find(int val){
	for (Map.Entry<Integer, Integer> entry:table.entrySet()) {
		int num=entry.getKey();
		int t=val-num;
		if(t==num){
			if(entry.getValue()>=2) return true;
		}else if(table.containsKey(t))
			return true;
		
	}
		return false;
}
}
