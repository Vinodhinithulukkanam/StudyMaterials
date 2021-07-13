package java8features;

import java.util.*;

public class listadddemo {

	public static void main(String[] args){
		
		List nelis=new ArrayList();
		
		for(int i=0;i<10;i++)
		nelis.add(i);
		nelis.add(2);
		System.out.println("new list "+nelis.toString());
		nelis.add(1,3);
		nelis.add(3);
		System.out.println("new list "+nelis.toString());
		
	}
}
