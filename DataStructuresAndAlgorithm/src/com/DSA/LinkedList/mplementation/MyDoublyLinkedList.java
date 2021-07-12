package com.DSA.LinkedList.mplementation;

public class MyDoublyLinkedList {

	
	private Node head;
	private Node tail;
	
	private static int length =0;
	
	public int Length(){
		return length;
	}
	
	public MyDoublyLinkedList(int inputval){
		this.head=new Node(inputval,"DoublyLinkedList");
		this.tail=this.head;
		length++;
	}
	
	public void add(MyDoublyLinkedList list,int inputval) {
		
		Node newnode=new Node(inputval);
		list.tail.next=newnode;
		newnode.previous=list.tail;
		list.tail=newnode;
		length++;
		
	}
	
	public void prepend(MyDoublyLinkedList list,int inputval){
		Node newnode=new Node(inputval);
		Node currentnode=list.head;
		currentnode.previous=newnode;
		newnode.next=currentnode;
		list.head=newnode;
		length++;
	}
	
	public void deleteNode(MyDoublyLinkedList list,int position){
		
		Node currentnode=list.head;
		
		int i=0;
		while(i<position){
			if(currentnode.next!=null)
				currentnode = currentnode.next;
			else
				list.tail=currentnode;
			i++;
		}
		Node PreviousNode=currentnode.previous;
		if(currentnode==list.tail){
			list.tail=PreviousNode;
			PreviousNode.next=null;
		}else{
			PreviousNode.next=currentnode.next;
			Node nextnode=currentnode.next;
			nextnode.previous=currentnode.previous;
		}
		
		
		currentnode=null;
		length--;
	}
	
	public void insertInMiddle(MyDoublyLinkedList list,int inputval,int position){
		
		Node currentnode=list.head;
		int i=0;
		if(position>Length()){
			System.out.println("Position greater than list length");
			return;
		}
		while(i<position){
			if(currentnode.next!=null)
				currentnode = currentnode.next;
			else
				list.tail=currentnode;
			i++;
		}
		
		Node newnode=new Node(inputval);
		
		if(currentnode==list.tail){
			newnode.next=currentnode;
			newnode.previous=currentnode.previous;
		}else{
			newnode.next=currentnode.next;
			newnode.previous=currentnode;
		}
		
		length++;
	}
	
	public void printList(MyDoublyLinkedList list){
		
		Node currentNode=list.head;
		
		while(currentNode!=null){
			
			System.out.print(currentNode.data+" -->");
			
			currentNode=currentNode.next;
			
		}
		
	}
}
