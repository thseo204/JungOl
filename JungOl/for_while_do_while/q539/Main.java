package q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int sum = 0;
		double avg =0;
		int i = 1;

		 do {
			sum += inp;
			inp = sc.nextInt();
			i++;
		} while (inp < 100);
		 sum += inp; 
		 avg = (double)sum / i;
		 sc.close();
		System.out.println(sum);
		System.out.printf("%.1f", avg);
	}
}