package com.pattern.SingletonPatter;

public class DriverLogger {

	public static void main(String[] args) {
		//Singleton design pattern can be used duing logging,print and any costly resource access
		Logger obj1=Logger.createInstance();
		Logger obj2=Logger.createInstance();
		System.out.println("Singleton design pattern create single object for any no. of object creation :");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println("Normal object creation creates 2 different objects :");
		Testlogger obj3=new Testlogger();
		Testlogger obj4=new Testlogger();
		
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());

	}

}
