package com.sample.Logictricks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateinTwoArray {

	public static void main(String[] args) {

		List<Integer> a1=Arrays.asList(1,5,6,4,0,8,9);
		List<Integer> a2=Arrays.asList(10,3,5,12,13,14);
		
		HashSet<Integer> hSet=new HashSet<Integer>();
		hSet.addAll(a1);
		
		a2.stream().filter(i -> hSet.contains(i)).findAny().ifPresent(System.out :: println);
		

	}

}
