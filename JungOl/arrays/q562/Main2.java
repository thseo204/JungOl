package q562;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, count = 0;
		int sum1 = 0, sum2 = 0;
		double avg = 0.0;

		for (int i = 1; i <= 10; i++) {
			num = sc.nextInt();
			if (i % 2 == 0) {
				sum1 += num;
			} else {
				sum2 += num;
				count++;
			}
		}
		sc.close();

		avg = (double) sum2 / count;
		System.out.printf("sum : %d\navg : %.1f", sum1, avg);
	}
}
