package q577;

import java.util.Scanner;

public class Main {
	public int[] divMul(int[] num) {
		if (num[0] > num[1]) {
			num[0] /= 2;
			num[1] *= 2;
		} else if (num[0] < num[1]) {
			num[0] *= 2;
			num[1] /= 2;
		}
		return num;
	}

	public void divMulPrint(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[2];
		inp[0] = sc.nextInt();
		for (int i = 1; i < inp.length; i++) {
			inp[i] = sc.nextInt();
			if (inp[0] == inp[i]) {
				i--;
				continue;
			} else {
				break;
			}
		}
		sc.close();

		Main m = new Main();
		int[] arr = m.divMul(inp);
		m.divMulPrint(arr);
	}
}