package q563;

import java.util.Scanner;
// 221114 품.
public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		
		for(int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}

		for (int i = 1; i < inp.length; i++) {
			for (int j = 0; j < inp.length; j++) {
				if (inp[i] > inp[j]) {
					int tmp = inp[j];
					inp[j] = inp[i];
					inp[i] = tmp;
				}
			}
		}
		sc.close();
		
		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
	}
}
