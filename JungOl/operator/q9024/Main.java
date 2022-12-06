package q9024;

import java.util.Scanner;

class Comparison{
	private int a;
	private int b;
	private int c;
	
	public Comparison() {
		Scanner sc = new Scanner(System.in);
		this.a = sc.nextInt();
		this.b = sc.nextInt();
		this.c = sc.nextInt();
		sc.close();
	}
	
	public void print() {
		int result = 0;
		result = a > b ? 1 : 0;
		System.out.print(result + " ");
		result = b >= c ? 1 : 0;
		System.out.print(result + " ");
		result = a <= b ? 1 : 0;
		System.out.print(result + " ");
		result = b < c ? 1 : 0;
		System.out.print(result + " ");
	}
}

public class Main {
	public static void main(String[] args) {
		Comparison c = new Comparison();
		c.print();
	}
}
