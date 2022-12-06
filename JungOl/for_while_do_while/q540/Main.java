package q540;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int div = 0;

		while (num % 3 == 0) {
			if (num % 3 != 0) {
				num = sc.nextInt();
			} else if(num % 3 == 0){
			} else {
				div = num / 3;
				System.out.println(div);
				num = sc.nextInt();
			}
		}
		sc.close();
	}
}