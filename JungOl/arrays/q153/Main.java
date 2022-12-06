package q153;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[100];
		int i = 0;

		do {
			inp[i] = sc.nextInt();
			if (inp[i] == -1) {
				sc.close();
				break;
			}
			i++;
		} while (i < 100);

		for (int j = i - 3; j < i; j++) {
			System.out.print(inp[j] + " ");
		}
	}
}
