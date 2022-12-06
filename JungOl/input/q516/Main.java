package q516;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double finput1 = sc.nextDouble();
		double finput2 = sc.nextDouble();
		char s = sc.next().charAt(0);
		sc.close();
		
		System.out.printf("%.2f\n%.2f\n%c", finput1, finput2, s);
	}
}
