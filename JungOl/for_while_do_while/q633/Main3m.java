package q633;

import java.util.Scanner;

public class Main3m {
	public static void main(String[] args) {
		String[] city = { "Seoul", "Washington", "Tokyo", "Beijing" };
		String[] con = { "1. Korea", "2. USA", "3. Japan", "4. China" };
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("%s\n%s\n%s\n%s\n", con[0], con[1], con[2], con[3]);
			System.out.print("number? ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.printf("\n%s\n\n", city[(num - 1)]);
				break;
			case 2:
				System.out.printf("\n%s\n\n", city[(num - 1)]);
				break;
			case 3:
				System.out.printf("\n%s\n\n", city[(num - 1)]);
				break;
			case 4:
				System.out.printf("\n%s\n\n", city[(num - 1)]);
				break;
			default:
				sc.close();
				System.out.println("none");
				break;
			}

//			if (!(1 <= num && num <= 4)) {
//			} else {
//				System.out.println();
//				System.out.println(city[(num - 1)]);
//				System.out.println();
//			}
		}
	}
}
