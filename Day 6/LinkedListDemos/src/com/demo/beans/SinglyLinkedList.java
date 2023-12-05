package com.demo.beans;
import com.demo.beans.SingleLinkedList.Node;

public class SinglyLinkedList {
	private Node head;
	class  Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	public SinglyLinkedList()
	{
		head=null;
	}
	
	public void addAtEnd(int value)
	{
		Node newnode=new Node(value);
		if(head==null)
		{
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	
	public static void main(String[] args) {
		
	}

}
