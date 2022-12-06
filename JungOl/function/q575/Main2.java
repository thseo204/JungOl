package q575;

import java.util.Scanner;

public class Main2 {
	public int involution(int inp1, int inp2) {
		int mul = inp1;
		for (int i = 1; i < inp2; i++) {
			if (inp2 == 0) {
				mul /= inp1;
			} else {
				mul *= inp1;
			}
		}
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2];

		for (int i = 0; i < num.length; i++) {
			int inp = sc.nextInt();
			if (inp <= 10) {
				num[i] = inp;
			} else {
				i--;
			}
		}
		sc.close();

		Main2 m = new Main2();
		int mul = m.involution(num[0], num[1]);
		System.out.println(mul);
	}
}