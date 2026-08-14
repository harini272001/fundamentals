package com.example.basics;
import java.util.Scanner;

public class BiggestOfThreeNumbers {
	static int bigofthree(int x, int y, int z) {
		if(x>=y && x>=z) {
			return x;
		}
		else if(y>=x && y>=z) {
			return y;
		}
		else {
			return z;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.print("Enter a number: ");
		int b = sc.nextInt();
		System.out.print("Enter a number: ");
		int c = sc.nextInt();
		int num = bigofthree(a,b,c);
		System.out.println(num + " is the biggest number");
		sc.close();	
		}

}
