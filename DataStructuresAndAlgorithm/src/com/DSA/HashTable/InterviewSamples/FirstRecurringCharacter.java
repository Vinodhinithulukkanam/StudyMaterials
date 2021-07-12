package com.DSA.HashTable.InterviewSamples;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRecurringCharacter {

	public static void main(String[] args) {
		char[] arr={'A','B','b','c','d'};
		HashSet<Character> recurringset=new HashSet<>();
	//	HashMap<Integer, Integer> recurringMap=new HashMap<>();
		boolean norecurringElement=false;
		for (char i : arr) {
			if(recurringset.contains(i)){
				System.out.println("Recurring Element is "+i);
				norecurringElement=true;
				break;
			}else{
				recurringset.add(i);
			}
		}

	}

}
