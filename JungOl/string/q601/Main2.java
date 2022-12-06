package q601;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		sc.close();
		
		for(int i = 1; i <= ch.length; i++) {
			for(int j = ch.length-i; j < ch.length; j++) {
				System.out.print(ch[j]);
			}
			for(int j = 0; j < ch.length-i; j++) {
				System.out.print(ch[j]);
			}
			System.out.println();
		}
	}
}
