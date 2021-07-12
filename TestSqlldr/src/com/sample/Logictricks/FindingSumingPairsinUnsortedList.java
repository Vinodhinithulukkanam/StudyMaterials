package com.sample.Logictricks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindingSumingPairsinUnsortedList {

	
	static List<Integer> str=new ArrayList<>();
	static int  arrIndex=0;
	static void  addPairs(int i,int j){
		
		str.add(i);
		str.add(j);
	}
	public static void main(String[] args) throws InterruptedException {
		List<Integer> input=Arrays.asList(2,7,11,15);
		int sum=9;
		HashMap<Integer,Integer> complementSet=new HashMap<Integer,Integer>();
		int arrSize=input.size();
		for(int index=0;index<arrSize;index++){
			int comp=sum - input.get(index);
			if(complementSet.containsKey(input.get(index))){
				addPairs(complementSet.get(input.get(index)).intValue(),index);
			}
			complementSet.put(comp,index );
		}
		
	}
}
