package q575;

import java.util.Scanner;

public class Main {
	public int involution(int num1, int num2) {
		int mul = num1;
		if (num2 > 0) {
			for (int i = 1; i < num2; i++) {
				num1 *= mul;
			}
		} else if (num2 == 0) {
			num1 /= num1;
		}
		return num1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2];

		for (int i = 0; i < num.length; i++) {
			int inp = sc.nextInt();
			if (inp <= 10) {
				num[i] = inp;
			}
		}
		sc.close();

		Main m = new Main();
		int mul = m.involution(num[0], num[1]);

		System.out.println(mul);
//		System.out.println(m.involution(num[0], num[1]));
	}
}