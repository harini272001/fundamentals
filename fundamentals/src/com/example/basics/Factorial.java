package com.example.basics;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int factNum = sc.nextInt();
		int num = 1;
		for (int i = 1; i <= factNum; i++ )
		{
			num = num * i;
		}
		System.out.println(num);
		sc.close(); 
	}
}
