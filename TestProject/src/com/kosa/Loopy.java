package com.kosa;

import java.util.Scanner;

public class Loopy {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반복 횟수 입력 >> ");
		int numberOfRepetitions = sc.nextInt();
		int x = 1;
		
		System.out.println("before the Loop");
		while(x < numberOfRepetitions) {
			System.out.println("In the Loop");
			System.out.println("Value of x is "+x);
			x += 1;
		}
		System.out.println("This is after the loop");
		sc.close();
	}

}
