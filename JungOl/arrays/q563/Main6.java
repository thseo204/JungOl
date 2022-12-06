package q563;

import java.util.Scanner;

// 선생님 방법
public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < inp.length; i++) {
			int max = 10, idx = -1;
			for(int j = 0; j < inp.length; j++) {
				if(max < inp[j]) {
					max = inp[j];
					idx = j;
				}
			}
			System.out.print("[ max : " + max + "] inp[ " + idx + "] ");
			inp[idx] = -1;
			
			for(int j = 0; j < inp.length; j++) {
				System.out.print(inp[j] + " ");
			}
			System.out.println();
			
		}

		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
	}
}
