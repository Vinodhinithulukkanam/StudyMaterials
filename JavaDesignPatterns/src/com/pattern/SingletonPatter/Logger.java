package com.pattern.SingletonPatter;

public class Logger {

	
	public static Logger log;
	private Logger(){
		
	}
	
	public static Logger createInstance(){
		if(log == null){
			log=new Logger();
		}
		return log;
	}
}
