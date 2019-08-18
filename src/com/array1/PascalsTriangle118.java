package com.array1;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
	 public List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> list=new ArrayList<List<Integer>>();
		 if(numRows==0)
			 return list;
		 ArrayList<Integer> last=new ArrayList<Integer>();
		 last.add(1);
		 list.add(last);
		 for (int i = 0; i < numRows; i++) {
			 ArrayList<Integer> t=new ArrayList<Integer>();
			 t.add(1);
			 for (int j = 0; j < i; j++) {
				t.add(last.get(j)+last.get(j-1));
			}
			 t.add(1);
			 list.add(t);
			 last=t;
		}
		 return list;
		 
	 }
}
