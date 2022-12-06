package q521;

import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

//		int newN1 = num1++;
//		int newN2 = --num2;
		int mul = num1++ * --num2;
		System.out.println(num1 + " " + num2 + " " + mul);
	}
}
