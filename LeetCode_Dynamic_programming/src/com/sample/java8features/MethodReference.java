package com.sample.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MethodReference {

	public static void main(String[] args) {
		List<Integer> inList=Arrays.asList(1,2,3,4,5,6,23,12,45,89);
		
		//Using Functions as parameters
		int max=inList.stream().filter(createEvenPredicate()).max(maxComparatormethod()).orElse(0);
		System.out.println(max);
		
		max=inList.stream().filter(MethodReference :: isEven).max(Integer :: compare).orElse(0);
		
		System.out.println(max);
		
		//Storing functions in variable
		Predicate<Integer> evenPredicate = createEvenPredicate();
		Comparator<Integer> maxComparator = maxComparatormethod();
		max=inList.stream().filter(evenPredicate).max(maxComparator).orElse(0);
		
		//Returning functions from methods
		max=inList.stream().filter(createEvenPredicate()).max(maxComparatormethod()).orElse(0);
	}

	private static Comparator<Integer> maxComparatormethod() {
		return (n1,n2) -> Integer.compare(n1, n2);
	}

	private static Predicate<Integer> createEvenPredicate() {
		return i -> i%2 == 0;
	}
	
	public static Boolean isEven(Integer i){
		return  i%2 == 0;
	}

}

class Evenpredicateinterface implements Predicate<Integer>{

	@Override
	public boolean test(Integer i) {
		return  i%2 == 0;
	}
	
}

class MaximumfindingInterface implements Comparator<Integer>{

	@Override
	public int compare(Integer n1, Integer n2) {
		return Integer.compare(n1, n2);
	}
	
}