package com.sample.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import java8features.Student;

public class StreamAPIExamples {
	
	public static <Students> void main(String[] args){
		
		List<Student> stulist= Arrays.asList(new Student(10,"vinodhini"),
											new Student(11,"ramya"),new Student(12,"jenny"),
		                                    new Student(13,"priya"));
		
		List<Student> newAge=stulist.stream().filter(i -> i.getAge() > 10).collect(Collectors.toList()).subList(0, 1);
		
		System.out.println("newAge :"+newAge);
		
		List<Integer> arrayInt=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<String> courseList=Arrays.asList("Microservice","Spring MVC","Kubernetes","Spring Boot","Docker","AWS","Google Cloud","AZC");
		
		//Filter uses predicats to decide on which argument to pass
		stulist.stream().filter(i -> ("vinodhini").equals(i.getName())).forEach(System.out :: println);
		
		System.out.println("************* odd numbers ****************");
		
		//Print only odd numbers
		arrayInt.stream().filter(i -> i % 2 != 0).forEach(System.out :: println);
		
		System.out.println("************* Print all courses ****************");
		
		//Print all courses
		courseList.stream().forEach(System.out :: println);
		
		System.out.println("*************  Print only string contains spring ****************");
		
		//Print only string contains spring
		courseList.stream().filter(i -> i.contains("Spring")).forEach(System.out :: println);

		System.out.println("*************  Print courses has atleast 4 letter in them ****************");
		
		courseList.stream().filter(i -> i.length()>=4).forEach(System.out :: println);
		
		System.out.println("*************  Print courses has atleast 4 letter parallel stream ****************");
		
		courseList.parallelStream().filter(i -> i.length()>=4).forEach(System.out :: println);
		
		//Map
		System.out.println("*************  Print Squar of odd number: want to do any operation and return that use map ****************");
		arrayInt.stream().filter(i -> i % 2 !=0).map(number -> number*number).forEach(System.out :: println);
		
		
		System.out.println("*************  Print length of each course ****************");
		courseList.stream().map(i -> i+" - "+i.length()).forEach(System.out :: println);
		
		System.out.println("*************  Print course starts with s ****************");
		courseList.stream().filter(i -> i.startsWith("S")).forEachOrdered(System.out :: println);
		
		System.out.println("************* Getting a list ****************");
		List<Integer> squareList =IntStream.range(1, 11).map(i -> i*i).boxed().collect(Collectors.toList());
		System.out.println("squareList :"+squareList);
		
}
}
