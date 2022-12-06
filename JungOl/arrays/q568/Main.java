package q568;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] inp1 = new int[2][4];
		int[][] inp2 = new int[2][4];
		
		System.out.println("first array");
		for(int i = 0; i < inp1.length; i++) {
			for(int j = 0; j < inp1[i].length; j++) {
				inp1[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("second array");
		for(int i = 0; i < inp2.length; i++) {
			for(int j = 0; j < inp2[i].length; j++) {
				inp2[i][j] = sc.nextInt(); 
			}
		}
		sc.close();
		
		int[][] mul = new int[2][4];
		for(int i = 0; i < inp1.length; i++) {
			for(int j = 0; j < inp1[i].length; j++) {
				mul[i][j] = inp1[i][j] * inp2[i][j];
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		}
	}
}
