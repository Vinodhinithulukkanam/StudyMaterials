package com.DSA.LinkedList.mplementation;


public class Node {
	public int data;
	public Node next;
	public Node previous;
	
	public Node(int inputval){
		this.data=inputval;
		next=null;
	}
	
	public Node(int inputval,String doublelink){
		this.previous=null;
		this.data=inputval;
		this.next=null;
	}
	 
	public String toString() {
		return "Data -->"+this.data ;
		
	}
	
}
