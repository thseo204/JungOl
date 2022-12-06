package q9017;

import java.util.Scanner;

class XY{
	private double d1;
	private double d2;
	
	public XY() {
		System.out.println("두 개의 실수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		sc.close();
		this.d1 = d1;
		this.d2 = d2;
	}
	
	public void print() {
		System.out.printf("x = %.2f\ny = %.2f\n", d1, d2);
	}
}

public class Main {
	public static void main(String[] args) {
		XY xy = new XY();
		xy.print();
	}
}
