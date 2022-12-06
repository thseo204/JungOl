package q517;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f1 = sc.nextDouble();
		double f2 = sc.nextDouble();
		double f3 = sc.nextDouble();
		sc.close();
		
		System.out.printf("%.3f\n%.3f\n%.3f\n", f1, f2, f3);
	}
}
