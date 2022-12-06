package q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int i = 1;
		int sum = 0;
		
		if (0 < num && num <=100) {
			while (i <= num) {
//				sum = sum + i;
				sum += i;
				
				i++;
			}
		System.out.println(sum);
		}
	}
}