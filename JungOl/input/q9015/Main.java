package q9015;

import java.util.Scanner;

class sumMul {
	private int num1;
	private int num2;

	public sumMul() {
		System.out.print("두 수를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void printSum() {
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
	}
	
	public void printMul() {
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
	}
}

public class Main {
	public static void main(String[] args) {
		sumMul sm = new sumMul();
		sm.printSum();
		sm.printMul();
	}
}
