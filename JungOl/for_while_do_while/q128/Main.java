package q128;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int inp = sc.nextInt();
			if (!(inp % 3 == 0 || inp % 5 == 0)) {
				int i = 1;
				sum += i++;
			} else if (inp == 0) {
				sc.close();
				break;
			}
		}
		System.out.println(sum);
	}
}
