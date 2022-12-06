package q578;

import java.util.Scanner;

class Gugudan {
	private int num1;
	private int num2;

	public Gugudan(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public void swap() {
		if (num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
	}

	public void printGugudan() {
		for (int i = getNum1(); i <= getNum2(); i++) {
			System.out.printf("== %ddan ==\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
		System.out.println();
	}
}

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2];
		for (int i = 0; i < num.length; i++) {
			int inp = sc.nextInt();
			if (0 < inp && inp < 10) {
				num[i] = inp;
			} else {
				i--;
			}
		}
		sc.close();

		Gugudan gu = new Gugudan(num[0], num[1]);
		gu.swap();
		gu.printGugudan();
	}
}