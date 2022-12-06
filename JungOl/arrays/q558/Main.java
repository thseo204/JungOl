package q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int count = 1; // 입력된 인덱스의 숫자가 있기 때문에 카운팅 할 필요 없음.

		for (int i = 0; i < num.length; i++) {
			int inp = sc.nextInt();
			if (inp != 0) {
				num[i] = inp;
				count += 1;
				// = count++;
			} else if (inp == 0) {
				break;
			}
		}
		sc.close();

		for (int i = 1; i < count; i++) {
			System.out.print(num[(count - 1) - i] + " ");
		}
//----------------------------------------------------------------------
		// T => do while 문
		int i = 0;
		do {
			num[i] = sc.nextInt();
		} while (num[i++] != 0);
		sc.close();

		for (int j = i - 2; j >= 0; j--) {
			System.out.print(num[j] + " ");
		}

//----------------------------------------------------------------------
		// 다른 학생 코드
		int[] n = new int[100];
		int inp = 0;

		for (int z = 0; z < n.length; z++) {
			inp = sc.nextInt();
			n[z] = inp;

			if (inp == 0) {
				for (int j = z - 1; j >= 0; j--) {
					System.out.print(n[j] + " ");
				}
				break;
			}
		}

		sc.close();
	}
}
