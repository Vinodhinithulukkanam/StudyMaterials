package com.sample.AnonymousInnerclass;

public class HelperAnalyser {
	
	public static void searchArr(String[] strList,String Search,StringAnalyzer stranalyzer){
		System.out.println("-- Helper class prints -- ");
		for(String Current:strList){
			if(stranalyzer.analyze(Current, Search))
				System.out.println("Match : "+Current);
		}
	}

}
