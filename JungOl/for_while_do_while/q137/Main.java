package q137;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= inp1; i++) {
			for(int j = 1, k = i; j <= inp2; j++) {
				System.out.print(k + " ");
				k += i;
			}
			System.out.println();
		}
	}
}
