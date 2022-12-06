package q596;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int inp = sc.nextInt();
		sc.close();

		char[] ch = str.toCharArray();

		for (int i = (ch.length - 1); i >= (ch.length - inp); i--) {
			if(ch.length < inp) {
				inp = ch.length;
			}
			System.out.print(ch[i]);
		}
	}
}
