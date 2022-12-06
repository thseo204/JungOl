package q158;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[100];
		int count = 0;
		
		for(int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
			if(inp[i]== 0) {
				sc.close();
				break;
			}
			if(inp[i] % 2 == 1) {
				inp[i] *= 2;
			} else {
				inp[i] /= 2;
			}
			count++;
		}
		System.out.println(count);
		for(int i = 0; i < count; i++) {
			System.out.print(inp[i] + " ");
		}
	}
}
