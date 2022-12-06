package q126;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int add = 0;
		int even = 0;

		for (int inp = 1; inp != 0;) {
			inp = sc.nextInt();

			if (inp % 2 != 0) {
				add += 1;
			} else if (inp % 2 == 0 && inp != 0) {
				even += 1;
			} else {
				break;
			}
		}
		sc.close();
		System.out.println("odd : " + add);
		System.out.println("even : " + even);
	}
}
