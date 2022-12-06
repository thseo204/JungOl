package q545;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mul3 = 0;
		int mul5 = 0;

		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if (num % 3 == 0 && num % 5 == 0) {
				mul3 += 1;
				mul5 += 1;
			} else if (num % 3 == 0 && num != 0) {
				mul3 += 1;
			} else if (num % 5 == 0 && num != 0) {
				mul5 += 1;
			} else {
				continue;
			}
		}
		sc.close();

		System.out.print("Multiples of 3 : ");
		System.out.println(mul3);
		System.out.print("Multiples of 5 : ");
		System.out.println(mul5);
	}
}