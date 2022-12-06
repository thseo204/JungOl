package q564;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = new char[26];

		for (int i = 0, j = 0; i < 26; i++, j++) {
			c[j] = (char) (i + 65);
		}

		int[] count = new int[26];
		char tmp = 0;

		do {
			tmp = sc.next().charAt(0);

			if ('A' <= tmp && tmp <= 'Z') {
				for (int i = 0; i < c.length; i++) {
					if (tmp == c[i]) {
						count[i] += 1;
					}
				}
			} else {
				sc.close();
				break;
			}
		} while (true);

		for (int i = 0; i < c.length; i++) {
			if (count[i] != 0) {
				System.out.printf("%c : %d\n", c[i], count[i]);
			}
		}
	}
}
