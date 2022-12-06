package q524;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		boolean a = (num1 != 0);// 2 = true
		boolean b = (num2 != 0);// 0 = false
		
//		System.out.println(a + " " + b);
		
		//if-else 문으로
		if (num1 != 0 && num2 !=0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println(" ");
		
		if (num1 != 0 || num2 !=0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// 이렇게도 가능!
		System.out.println((a && b) + " " + (a || b));
		
		//이렇게도 가능!
		boolean c = a && b;
		boolean d = a || b;
		
		System.out.printf("%b %b", c, d);
		
	}
}
