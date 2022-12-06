package q578;

import java.util.Scanner;
// 선생님 코드
class Gugudan1 {
	private int inp1;
	private int inp2;

	public void input() {
		Scanner sc = new Scanner(System.in);
		inp1 = sc.nextInt();
		inp2 = sc.nextInt();
		sc.close();

//		System.out.println(inp1 + " " + inp2);
	}

	public void swap() {
		// 1. swap
		if (inp1 > inp2) {
			int tmp = inp1;
			inp1 = inp2;
			inp2 = tmp;
		}
	}

	public void print() {
		// 2. print
		for (int i = inp1; i <= inp2; i++) {
			System.out.println("== " + i + "dan ==");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = ");
				System.out.printf("%2d\n", i * j);
			}
			System.out.println();
		}
	}
}

public class Main3 {
	public static void main(String[] args) {
		Gugudan1 gu = new Gugudan1();
		gu.input();
		gu.swap();
		gu.print();
	}
}