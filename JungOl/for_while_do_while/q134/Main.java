package q134;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0, odd = 0;
		for(int i = 0; i < 10; i++) {
			int inp = sc.nextInt();
			if(inp % 2 == 1) {
				odd++;
			} else {
				even++;
			}
		}
		sc.close();
		
		System.out.printf("even : %d\nodd : %d", even, odd);
	}
}
