package com.sample.AnonymousInnerclass;

public class ContainsAnalyzer implements StringAnalyzer {

	@Override
	public boolean analyze(String target, String search) {
		
		System.out.println("Inside containsAnalyzer");
		return target.contains(search);
	}
	

	}
