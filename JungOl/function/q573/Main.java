package q573;

import java.util.Scanner;

public class Main {
	int[][] square;
	
	public int[][] square (int inp) {
		square = new int[inp][inp];
		for(int i = 0, num = 1; i < inp; i++) {
			for(int j = 0; j <inp; j++) {
				square[i][j] = num++; 
				System.out.print(square[i][j] +" ");
			}
			System.out.println();
		}
		return square;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		Main arr = new Main();
		arr.square(inp);
	}
}