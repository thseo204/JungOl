package q524;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		boolean a = (inp1 != 0);
		boolean b = (inp2 != 0);
		
		System.out.println(a + " " + b);
		
	}
}
