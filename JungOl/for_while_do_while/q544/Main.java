package q544;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		
		if(num <= 100) {
			for(int i = num; i <=100; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
	}
}