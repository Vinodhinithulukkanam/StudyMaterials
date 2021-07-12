package com.pattern.FactoryPattern;

import java.util.Scanner;

public class DriveDivideWithoutPattern {

	public static void main(String[] args) {
		System.out.println("Enter numbers to divide");
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		
		Divide d1=new Divide();
		System.out.println("Divede value :"+d1.calculate(a, b));

	}

}
