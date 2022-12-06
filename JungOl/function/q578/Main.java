package q578;

import java.util.Scanner;

public class Main {
	private int num1;
	private int num2;
	
	public void setOrder(int num1, int num2) {
		if (num1 > num2) {
			int tmp = num1;
			this.num1 = num2;
			this.num2 = tmp;
		} else {
			this.num1 = num1;
			this.num2 = num2;
		}
	}

	public void getGugudan() {
		for (int i = num1; i <= num2; i++) {
			System.out.println("== " + i + "dan ==");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;

		do {
			int inp1 = sc.nextInt();
			int inp2 = sc.nextInt();
			if ((0 < inp1 && inp1 <= 10) && (0 < inp2 && inp2 <= 10)) {
				num1 = inp1;
				num2 = inp2;
				break;
			} else {
				continue;
			}
		} while (true);
		sc.close();

		Main m = new Main();
		m.setOrder(num1, num2);
		m.getGugudan();
	}
}