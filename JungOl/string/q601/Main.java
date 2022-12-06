package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		sc.close();
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = str.length()-1-i; j < str.length(); j++) {
				System.out.print(ch[j]);
			}
			for(int j = 0; j < str.length()-1-i; j++) {
				System.out.print(ch[j]);
			}
			System.out.println();
		}
	}
}
