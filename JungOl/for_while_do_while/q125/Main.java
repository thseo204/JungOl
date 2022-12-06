package q125;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int put=sc.nextInt();
		sc.close();
		for(int i=1;i<=put;i++) {
			System.out.print(i + " ");
		}
	}
}