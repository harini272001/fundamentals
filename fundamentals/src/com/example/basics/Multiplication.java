package com.example.basics;
import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numer: ");
		int a = sc.nextInt();
		for (int i = 1; i<= 10; i++) 
		{
			int b = i * a;
			System.out.println(i + " * " + a + " = " + b);
		}
		sc.close(); 
	}
}
