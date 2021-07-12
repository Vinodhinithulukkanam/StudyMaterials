package com.pattern.FactoryPattern;

public class Sum implements Calculate {

	@Override
	public double doCalculate(int a, int b) {
		return a+b;
	}

	
}
