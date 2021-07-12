package com.DSA.LinkedList.mplementation;

public class MyLinkedList {

	
	private Node head;
	
	private Node tail;
	
	private static int length =0;
	
	public int Length(){
		return length;
	}
	
	public MyLinkedList(int inputval){
		this.head=new Node(inputval);
		this.tail=this.head;
		length++;
		
	}
	
	public void add(MyLinkedList list,int inputval) {
		
		Node newnode=new Node(inputval);
		list.tail.next=newnode;
		list.tail=newnode;
		length++;
		
	}
	
	public void prepend(MyLinkedList list,int inputval){
		Node newnode=new Node(inputval);
		Node currentnode=list.head;
		newnode.next=currentnode;
		list.head=newnode;
		length++;
	}
	
	public void deleteNode(MyLinkedList list,int position){
		
		Node currentnode=list.head;
		Node Previous=currentnode;
		int i=0;
		while(i<position){
			Previous=currentnode;
			if(currentnode.next!=null)
				currentnode = currentnode.next;
			else
				list.tail=currentnode;
			i++;
		}
		if(currentnode==list.tail){
			Previous.next=null;
		}else{
			Previous.next=currentnode.next;
		}
		
		currentnode=null;
		length--;
	}
	
	public void insertInMiddle(MyLinkedList list,int inputval,int position){
		
		Node currentnode=list.head;
		Node Previous=currentnode;
		int i=0;
		while(i<position){
			Previous=currentnode;
			currentnode = currentnode.next;
			i++;
		}
		
		Node newnode=new Node(inputval);
		if(Previous.next==null){
			list.tail=newnode;
		}
		Previous.next=newnode;
		newnode.next=currentnode;
		length++;
	}
	
	public void printList(MyLinkedList list){
		
		Node currentNode=list.head;
		
		while(currentNode!=null){
			
			System.out.print(currentNode.data+" -->");
			
			currentNode=currentNode.next;
			
		}
		
	}

	public MyLinkedList reverse(MyLinkedList list){
		
		if(list.length<=1){
			return list;
		}
		Node first=list.head;
		Node second=first.next;
		this.tail = first;
		while(second!=null){
			Node temp=second.next;
			second.next=first;
			first=second;
			second=temp;
		}
		this.head.next=null;
		this.head=first;
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyLinkedList [" + (head != null ? "head=" + head + ", " : "") + (tail != null ? "tail=" + tail : "")
				+ "]";
	}
}
