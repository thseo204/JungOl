package q107;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f1 = 80.5;
		double f2 = 22.34;
		sc.close();
		
		double sum = f1 + f2;
		
		System.out.printf("%10.2f%10.2f%10.2f", f1, f2, sum);
	}
}
