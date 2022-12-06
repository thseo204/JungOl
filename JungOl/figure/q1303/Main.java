package q1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		sc.close();
		int num = 1;
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(num++  + " ");
			}
			System.out.println();
		}
	}
}
