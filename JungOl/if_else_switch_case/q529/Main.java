package q529;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hight = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();

		int bmi = weight + 100 - hight;
		
		System.out.println(bmi);
		if (0 < bmi) {
			System.out.println("Obesity");
		}
	}
}
