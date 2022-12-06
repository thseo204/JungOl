package q560;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int min = Integer.MAX_VALUE;

		// 방법 1.
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//			if (num[i] < min) {
//				min = num[i];
//			}
//		}

		// 방법 2.
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			min = num[i] < min ? num[i] : min;
		}
		sc.close();

		System.out.println(min);
	}
}
