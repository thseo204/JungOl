package q563;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int tmp = 0;
		
		for(int i = 0; i < inp.length; i++) {
			inp[i]= sc.nextInt(); 
		}
		sc.close();
		
		for(int i = 1; i < inp.length; i++) {
			for(int j = 0; j < inp.length; j++) {
				if(inp[i] > inp[j]) {
					tmp = inp[i];
					inp[i]= inp[j];
					inp[j]= tmp; 
				}
			}
		}
		for(int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
	}
}
