package q156;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[100];
		int i = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		do {
			inp[i] = sc.nextInt();
			if(inp[i] >= 999) {
				sc.close();
				break;
			}
			max = max > inp[i] ? max : inp[i];
			min = min < inp[i] ? min : inp[i];
		} while(true);
		
		System.out.printf("max : %d\nmin : %d", max, min);
	}
}
