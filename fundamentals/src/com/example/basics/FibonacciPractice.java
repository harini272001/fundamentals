package com.example.basics;
import java.util.Scanner;

public class FibonacciPractice {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int firstNum = 0;
		int secondNum = 1;
		System.out.print(firstNum + " ");
		System.out.print(secondNum + " ");
		for(int i = 3; i <= n; i++) 
		{
			int thirdNum = firstNum + secondNum;
			System.out.print(thirdNum + " ");
			firstNum = secondNum;
			secondNum = thirdNum;
		}
		sc.close();
	}
}
