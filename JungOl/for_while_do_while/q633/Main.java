package q633;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] city = { "Seoul", "Washington", "Tokyo", "Beijing" };
		String[] con = { "1. Korea", "2. USA", "3. Japan", "4. China" };
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("%s\n%s\n%s\n%s\n", con[0], con[1], con[2], con[3]);
			System.out.print("number? ");
			int num = sc.nextInt();
			System.out.println();
			if(num == 1) {
				System.out.println(city[0]);
			}else if(num == 2) {
				System.out.println(city[1]);
			}else if(num == 3) {
				System.out.println(city[2]);
			}else if(num == 4) {
				System.out.println(city[3]);
			}
			System.out.println();
			if (!(1 <= num && num <= 4)) {
				System.out.print("none");
				sc.close();
				break;
			}
		}
	}
}
