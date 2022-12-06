package q532;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		sc.close();
		
		if (4.0 <= num1 && 4.0 <= num2) {
			System.out.println("A");
		} else if (3.0 <= num1 && 3.0 <=num2) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		
//		if (num1 >= 4.0) {
//			if (num2 >= 4.0) {
//				System.out.println("A");
//			} else {
//				System.out.println("C");
//			}
//		}else if (num1 >= 3.0) {
//			if (num2 >= 3.0) {
//				System.out.println("B");
//			}else {
//				System.out.println("C");				
//			}
//		}else {
//			System.out.println("C");							
//		}
	}
}
