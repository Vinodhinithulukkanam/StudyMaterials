package com.sample.Logictricks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FindSumingPairs {
	
	//Findingsuming pairs in Sorted order array
	static Map<Integer,Integer> str=new HashMap<Integer,Integer>();
	static void  addPairs(int i,int j){
		
		str.put(i, j);
	}
	public static void main(String[] args) throws InterruptedException {
		List<Integer> input=Arrays.asList(1,2,3,4,5,6,7);
		int sum=5;
		
		int low=0;
		int high=input.size() - 1;
		
		while(low<high){
			
			int stipulatedSum=input.get(low)+input.get(high);
			if(stipulatedSum == sum){
				 addPairs(input.get(low), input.get(high));
				 high--;
				 low++;
			}
			
			else if(stipulatedSum > sum )
				high--;
			else if(stipulatedSum < sum )
				low++;
		}
	
		System.out.println(str);
	}

}
