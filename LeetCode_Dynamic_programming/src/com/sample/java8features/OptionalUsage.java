package com.sample.java8features;

import java.util.Arrays;
import java.util.List;

public class OptionalUsage {

	public static void main(String[] args) {
		List<Integer> arrayInt=Arrays.asList(2,4,6,8,9,4,10,12,6,6,8);
		
		arrayInt.stream().filter(i -> i!=1).distinct().max((n1,n2) -> -Integer.compare(n1,n2)).ifPresent(i -> System.out.println(i*i));
		
		int res=arrayInt.stream().filter(i -> i!=1).distinct().max((n1,n2) -> -Integer.compare(n1,n2)).get();
		
		System.out.println(" res :"+res);

		res=arrayInt.stream().filter(i -> i%2!=0).distinct().max((n1,n2) -> -Integer.compare(n1,n2)).orElse(0);
		
		System.out.println(" res :"+res);
		
	}

}
