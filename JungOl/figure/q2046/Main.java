package q2046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		switch (m) {
		case 1:
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = 1; i <= n; i++) {
				for (int j = 1, k = n; j <= n; j++, k--) {
					if (i % 2 == 1) {
						System.out.print(j + " ");
					} else {
						System.out.print(k + " ");
					}
				}
				System.out.println();
			}
			break;
		case 3:
			for (int i = 1; i <= n; i++) {
				for (int j = 0, k = i; j < n; j++, k += i) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
			break;
		default:
			break;
		}
	}
}
