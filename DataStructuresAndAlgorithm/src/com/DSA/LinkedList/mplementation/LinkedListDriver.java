package com.DSA.LinkedList.mplementation;

public class LinkedListDriver {

	public static void main(String[] args)  {
		
		int j=10;
		MyLinkedList list=new MyLinkedList(j);
		
		for(int i=0;i<2;i++){
			list.add(list,++j);
		}
		System.out.println();
		list.insertInMiddle(list, 800, 2);
		list.printList(list);
		list.reverse(list);
		System.out.println("Reverse list");
		list.printList(list);


	}

}
