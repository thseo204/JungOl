package q555;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = new char[10];
		for(int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0); 
		}
		sc.close();
		
		for(int i = 0; i < c.length; i++){
			System.out.printf("%c",c[i]);
		}
	}
}