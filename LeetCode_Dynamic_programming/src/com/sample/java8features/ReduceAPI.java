package com.sample.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceAPI {

	public static void main(String[] args) {


		List<Integer> arrayInt=Arrays.asList(1,2,5,6,7,8,9,5,4,3,3,6,6,8,1,7);
		
		List<String> courseList=Arrays.asList("MICROSERVICE","Spring MVC","KUBERNETES","Spring Boot","Docker","AWS","Google Cloud","AZC");
		
		/********************* Reduce ***********************************/
		
		System.out.println("********************* Reduce ***********************************");
		//Sum of array
		int sum = arrayInt.stream().reduce(0,(n1,n2) -> n1+n2);
		System.out.println(sum);
		
		//Sum of even number in the array
		sum=arrayInt.stream().filter(i -> i%2 == 0).reduce(0, (n1,n2) -> n1+n2);
		System.out.println(sum);
		
		//Sum of odd number in the array
		sum=arrayInt.stream().filter(i -> i%2 != 0).reduce(0, (n1,n2) -> n1+n2);
		System.out.println(sum);
		
		/********************* Sorted ***********************************/
		System.out.println("********************* Sorted ***********************************");
		arrayInt.stream().sorted().forEach(System.out :: println);
		
		/******************** distinct *********************************/
		
		System.out.println("********************* distinct ***********************************");
		arrayInt.stream().distinct().forEach(System.out :: println);
		
		System.out.println("********************* distinct + sorted ***********************************");
		
		arrayInt.stream().distinct().sorted().forEach(System.out :: println);
		
		System.out.println("********************* Square of 1-10  numbers ***********************************");
		IntStream.range(0, 10).map(i -> i*i).forEach(i -> System.out.println(i));
		
		System.out.println("********************* print course in lower case ***********************************");
		courseList.stream().map(i -> i.toLowerCase()).forEach(System.out :: println);
	}

}
