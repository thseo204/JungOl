package q531;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double weight = sc.nextDouble();
		sc.close();

		if (weight <= 50.80) {
			System.out.println("Flyweight");
		} else if (weight <= 61.23) {
			System.out.println("Lightweight");
		} else if (weight <= 72.57) {
			System.out.println("Middleweight");
		} else if (weight <= 88.45) {
			System.out.println("Cruiserweight");
		} else {
			System.out.println("Heavyweight");
		}
	}
}