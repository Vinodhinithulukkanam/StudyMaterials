package com.sample.AnonymousInnerclass;

public class AnalysingString {
	
	public static void main(String[] args){
		
		String[] str={"tomorrow","todo","to","tumbaukto","hello","heat"};
		
		ContainsAnalyzer analyze=new ContainsAnalyzer();
		
		String search="to";
		
		System.out.println("--Searching for string -- "+search);
		
		//with enhanced for loop
	/*	
		for(String Current:str){
			if(analyze.analyze(Current, search))
				System.out.println("Match : "+Current);
		}*/
		
		//with helper class
		//HelperAnalyser.searchArr(str, search, analyze);
		
		//Inner class
		/*HelperAnalyser.searchArr(str, search, new StringAnalyzer() {
			
			@Override
			public boolean analyze(String target, String search) {
				System.out.println("Inside Inner class");
				return target.contains(search);
			}
		});*/
		
		//With Lambda Expression
		//HelperAnalyser.searchArr(str, search, (t,s) ->{System.out.println("Inside Lambda Expression"); return t.contains(s);});
		
		System.out.println("Start With -- "+search);
		HelperAnalyser.searchArr(str, search, (t,s) -> t.startsWith(s));
		
		System.out.println("Ends With -- "+search);
		HelperAnalyser.searchArr(str, search, (t,s) -> t.endsWith(s));
		
		System.out.println("Less than 5 -- "+search);
		HelperAnalyser.searchArr(str, search, (t,s) -> t.contains(s) && t.length()< 5);
		
		System.out.println("More than 5 -- "+search);
		HelperAnalyser.searchArr(str, search, (t,s) -> t.contains(s) && t.length()> 5);
		
		
		
		
		
		
	}

}
