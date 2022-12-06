package q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int max = 0;
		int min = Integer.MIN_VALUE;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

			if (1 <= inp[i] && inp[i] < 100) {
				max = (max > inp[i]) ? max : inp[i];
			} else if (100 <= inp[i] && inp[i] < 10000) {
				min = (min < inp[i]) ? min : inp[i];
			}
		}
		if (max == 0) {
			max = 100;
		}
		if (min == 10000) {
			min = 100;
		}
		System.out.print(max + " " + min);
		sc.close();
	}
}
