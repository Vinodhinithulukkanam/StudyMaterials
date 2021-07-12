package com.DSA.Recursion;

public class Factorial {

	public static void main(String[] args) {
		int basecase=5,j=5;
		int f=1;
		int result=1;
			
		
		result=factByRecursion(basecase);
		
		
		System.out.println("Factorial of  "+j+" by recursion: "+result);
		
		for(int i=1;i<5;i++){
			f=f*(i+1);
		}
		
		System.out.println("Factorial of  "+j+" by iteration: "+f);
	}
	
	public static int factByRecursion(int f){
		
		
		if(f>1){
			f=f*factByRecursion(f-1);
		}else{
			return f;
		}
		
		return f;
	}

	
	
}
