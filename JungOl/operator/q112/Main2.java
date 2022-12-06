package q112;

import java.util.Scanner;

class Divide{
	private int num1;
	private int num2;
	
	public Divide() {
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
	}
	
	public void print() {
		int result = num1 / num2;
		int remain = num1 % num2;
		System.out.printf("%d / %d = %d...%d", num1, num2, result, remain);
	}
	
}

public class Main2 {
	public static void main(String[] args) {
		Divide div = new Divide();
		div.print();
	}
}
