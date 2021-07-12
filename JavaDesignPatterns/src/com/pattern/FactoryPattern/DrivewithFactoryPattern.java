package com.pattern.FactoryPattern;

import java.util.Scanner;
 /*By usin factory pattern we are open to any calculation making 
 it lossly coupled for future changes*/
public class DrivewithFactoryPattern {

	public static void main(String[] args) {
		
		System.out.println("Enter numbers to divide");
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		
		CalculateFactory factory=new CalculateFactory();
		System.out.println("Enter operation add/sub/divide");
		String operation=new Scanner(System.in).nextLine();
		Calculate obj=factory.chooseOperation(operation);
		System.out.println(obj.doCalculate(a, b));

	}

}
