package com.bridgelabz.day14;

class Node {
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	Node head;
	
	public void addFirst(int data) 
	{
		Node newnode = new Node(data);

		if(head == null)
		{
			head = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}
	
	public void addLast(int data)
	{
		Node newnode = new Node(data);
		Node tempnode = head;

		if(head == null)
		{
			head = newnode;
			return;
		}
		
		while(tempnode.next != null)
		{
			tempnode = tempnode.next;
		}
		tempnode.next = newnode;
	}
	
	public void add(int data,int index)
	{
		int i = 1;
		Node newnode = new Node(data);
		Node prevnode = head;
		Node tempnode = head.next;
		
		if(head == null) {
			addFirst(data);
			return;
		}

		while(tempnode != null)
		{
			if(i == index)
			{
				prevnode.next = newnode;
				newnode.next = tempnode;
				return;
			}
			else
			{
				i++;
				prevnode = prevnode.next;
				tempnode = tempnode.next;
			}
		}
		
		addLast(data);
	}
	
	public void display()
	{
		if(head == null)
		{
			System.out.println("Linked List ie ");
		}
		Node tempnode = head;
		
		while(tempnode.next != null)
		{
			System.out.print(tempnode.data + "=>");
			tempnode = tempnode.next;
		}
		System.out.println(tempnode.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList li = new LinkedList();

		li.addLast(56);
		li.addLast(70);
		li.display();
		li.add(30, 1);
		li.display();
	}

}
