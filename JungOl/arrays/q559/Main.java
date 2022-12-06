package q559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] avg = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		int classNum1 = sc.nextInt();
		int classNum2 = sc.nextInt();
		sc.close();

		double sum = avg[classNum1 - 1] + avg[classNum2 - 1];

		System.out.printf("%.1f", sum);
	}
}
