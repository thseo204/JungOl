package q1304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		// 1st. 내 코드
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n * n; j = j + n) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 2nd. 선생님 코드
		int[][] ar = new int[n][n];
		int num = 1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[j][i] = num++;
			}
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}
