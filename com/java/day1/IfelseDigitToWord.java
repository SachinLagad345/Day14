package com.java.day1;

import java.util.Scanner;

public class IfelseDigitToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter single digit number");
		int n = sc.nextInt();
		
		if(n == 0) {
			System.out.println("Zero");
		}
		else if(n == 1) {
			System.out.println("One");
		}
		else if(n == 2) {
			System.out.println("Two");
		}
		else if(n == 3) {
			System.out.println("Three");
		}
		else if(n == 4) {
			System.out.println("Four");
		}
		else if(n == 5) {
			System.out.println("Five");
		}
		else if(n == 6) {
			System.out.println("Six");
		}
		else if(n == 7) {
			System.out.println("Seven");
		}
		else if(n == 8) {
			System.out.println("Eight");
		}
		else if(n == 9) {
			System.out.println("Nine");
		}
		else
		{
			System.out.println("Please Enter valid single digit number");
		}
	}

}
