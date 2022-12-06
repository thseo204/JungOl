package q565;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] inp = new int[100];
		int inp = 0;
		int[] count = new int[10];
		int[] counter = new int[10];
		for (int i = 0; i < count.length; i++) {
			count[i] = i;
		}
		// count[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		for (;;) {
			inp = sc.nextInt();
			if (inp == 0) {
				sc.close();
				break;
			}
			inp = inp / 10;
			for (int j = 0; j < count.length; j++) {
				if (count[j] == inp) {
					counter[j] += 1;
				}
			}
		}

		for (int i = 0; i < count.length; i++) {
			if (counter[i] != 0) {
				System.out.printf("%d : %d\n", count[i], counter[i]);
			}
		}
	}
}
