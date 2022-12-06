package q133;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int inp = sc.nextInt();
			sum += inp;
		}
		sc.close();
		
		double avg  = (double)sum / n;
		System.out.printf("%.2f", avg);
	}
}
