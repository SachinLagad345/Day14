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
}

public class StackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(70);
		st.push(30);
		st.push(56);
		st.display();
	}

}
