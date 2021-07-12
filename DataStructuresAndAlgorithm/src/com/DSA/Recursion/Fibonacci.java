package com.DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

	int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonaciIteration(5);
		fibonacciRecu(5);
	}

	public static int fibonacciRecu(int n){
		int res=1;int n2=1;
		if(n>0){
			res= fibonacciRecu(n-1)+fibonacciRecu(n-2);
		}
		System.out.println(res);
		return res;
	}
	
	public static void fibonaciIteration(int n){
		List<Integer> arr=new ArrayList<>();
		arr.add(0);
		arr.add(1);
		if(n<2){
			System.out.println(arr);
		}
	
		for(int i=2;i<n;i++){
			arr.add(i, arr.get(i-1)+arr.get(i-2));
		}
		System.out.println(""+arr.get(n-1));
	}
}
