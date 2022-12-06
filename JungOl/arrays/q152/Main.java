package q152;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int even = 0, odd = 0;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
			if (i % 2 == 0) {
				odd += inp[i];
			} else {
				even += inp[i];
			}
		}
		sc.close();

		System.out.printf("odd : %d\neven : %d", odd, even);
	}
}
