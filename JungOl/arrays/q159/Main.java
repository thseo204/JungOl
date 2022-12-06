package q159;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] inp = new int[n];
		
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 1; i < inp.length; i++) {
			for (int j = 0; j < inp.length; j++) {
				if (inp[j] < inp[i]) {
					int tmp = inp[i];
					inp[i] = inp[j];
					inp[j] = tmp;
				}
			}
		}
		for (int i = 0; i < inp.length; i++) {
			System.out.println(inp[i]);
		}
	}
}
