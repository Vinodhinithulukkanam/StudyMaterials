package com.DSA.HashTable;

import java.util.Hashtable;

public class UserHashTable {
	
	private static class Bucket{
		
		private int Bucketsize;
		
		public Bucket(int size){
			this.Bucketsize=size;
		}
		
		public static String key;
		public static String value;
	}
	private String[] data;
	
	public UserHashTable(int size){
		new Bucket(size);
	}

	public void setData(String key,String Value){
		Bucket.key=key;
		Bucket.value=Value;
		
		System.out.println("Data setted Key "+key+" Value :"+Value);
	}
	
}
