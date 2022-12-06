package q593;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("ASCII code =? ");
			int inp = sc.nextInt();
			
			char c = (char)inp;
			System.out.println(c);
			
			if(!(33 <= inp && inp <= 127)) {
				break;
			}
		}
		sc.close();
	}
}