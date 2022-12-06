package q574;

import java.util.Scanner;

public class Main2 {
	public int max(int[] inp) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < inp.length; i++) {
			max = max > inp[i] ? max : inp[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

		Main2 mathMax = new Main2();
		int max = mathMax.max(num);
		
		System.out.println(max);
	}
}
