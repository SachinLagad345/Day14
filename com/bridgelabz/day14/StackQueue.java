package com.bridgelabz.day14;

class Stack{
	LinkedList<Integer> li = new LinkedList<Integer>();
	
	public void push(int data)
	{
		li.addFirst(data);
		return;
	}
	
	public void display()
	{
		li.display();
	}
	
	public Comparable<Integer> peak()
	{
		if(li.head == null)
		{
			System.out.println("Stack is empty!");
			return null;
		}
		return li.head.data;
	}
	
	public Comparable<Integer> pop()
	{
		if(li.head == null)
		{
			System.out.println("Stack is empty!");
			return null;
		}
		Comparable<Integer> data = li.head.data;
		li.head = li.head.next;
		return data;
	}
}

class Queue{
	LinkedList<Integer> li = new LinkedList<Integer>();
	
	public void enqueue(int data)
	{
		li.addLast(data);;
		return;
	}
	
	public void display()
	{
		li.display();
	}
}

public class StackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack st = new Stack();
//		st.push(70);
//		st.push(30);
//		st.push(56);
//		st.display();
//		
//		
//		System.out.println("peak element from stack = " + st.peak());
//		st.display();
//		System.out.println("popping element from stack = "+ st.pop());
//		st.display();
		
		Queue qu = new Queue();
		qu.enqueue(56);
		qu.enqueue(30);
		qu.enqueue(70);
		qu.display();
	}

}
