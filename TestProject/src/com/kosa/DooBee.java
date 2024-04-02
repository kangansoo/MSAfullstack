package com.kosa;

public class DooBee {
	public static void main(String[] args) {
		int numberOfLoops=3;
		printDooBee(numberOfLoops);
			printLastDo();
		}
		static void printDooBee(int numberOfLoops) {
			int x = 1;
			while(x<numberOfLoops) {
				System.out.print("Doo");
				System.out.print("Bee");
				x += 1;
			}
		}
		static void printLastDo() {
			System.out.print("Do");
	}
}
