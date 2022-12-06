package q557;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = new char[10];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
		}
		sc.close();
		
		for(int i = 0; i < 7; i = i + 3){
			System.out.print(c[i] + " ");
		}

//		System.out.printf("%c %c %c", c[0], c[3], c[6]);
	}
}