package q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char ch = sc.next().charAt(0);
			if('A' <= ch && ch <= 'Z') {
				System.out.println(ch);
			} else if('a' <= ch && ch <= 'z') {
				System.out.println(ch);
			} else if('0' <= ch && ch <= '9'){
				System.out.println((int)(ch));
			} else {
				sc.close();
				break;
			}
		}
	}
}
