package q596;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int num = sc.nextInt();
		sc.close();

		char[] c = s.toCharArray();

		if (num > c.length) {
			for(int i = 0; i < c.length; i++) {
			System.out.print(c[(c.length -1 ) - i]);
			}
		} else {
			for (int i = 0; i < num; i++) {
				System.out.print(c[(c.length - 1) - i]);
			}
		}
	}
}
