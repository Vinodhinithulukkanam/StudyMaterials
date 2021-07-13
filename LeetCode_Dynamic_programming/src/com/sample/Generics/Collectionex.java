package com.sample.Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Collectionex {
	
	public static void main(String[] args){
		int MAX_ENTRIES=3;
		/*LinkedHashMap<Integer,String> genericList=new LinkedHashMap<Integer,String>() {
			protected boolean removeEldestEntry(Map.Entry<Integer,String> eldest) {
			            return size() > MAX_ENTRIES;
			         }
		};*/
		HashMap<Integer, String> genericList=new HashMap<Integer, String>();
			genericList.put(1,"vino");
		
		genericList.put(2,"has");
		genericList.put(3,"Entered");
		System.out.println("genericList :"+genericList);
		genericList.put(4,"linked" );
		
		System.out.println("genericList :"+genericList);
		
		genericList.put(5,"hash");
		
		
		genericList.put(6,"map");
		
		System.out.println("genericList :"+genericList);
		
		Iterator<Entry<Integer, String>> iterator=genericList.entrySet().iterator();
		int i=1;
		while (iterator.hasNext()){
			System.out.println(iterator.next().getValue());
		}
		
		
	}

}
