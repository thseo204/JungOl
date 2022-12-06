package q593;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ASCII code =? ");
		int inp = sc.nextInt();
		
		while(33 <= inp && inp <= 127) {
			char c = (char)inp;
			
			System.out.println(c);
			System.out.print("ASCII code =? ");
			inp = sc.nextInt();
		}
		sc.close();
	}
}