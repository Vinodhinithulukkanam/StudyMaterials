package com.pattern.FactoryPattern;

public class Divide implements Calculate {

	public double calculate(int a,int b){
		return (a/b);
	}

	@Override
	public double doCalculate(int a, int b) {
		// TODO Auto-generated method stub
		return (a/b);
	}
}
