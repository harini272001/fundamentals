package com.example.basics;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int inpNum = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " ");
		System.out.print(n2+ " ");
		for(int i = 3; i <= inpNum; i++)
		{
			int n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
		sc.close();
	}

}
