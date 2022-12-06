package q9018;

import java.util.Scanner;

class MyMath{
	private int num1;
	private int num2;
	
	public MyMath(){
		System.out.print("두 개의 수를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void print() {
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
	}
}

public class Main {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		mm.print();
	}
}
