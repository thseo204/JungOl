package q576;

import java.util.Scanner;

public class Main {
	public void math(int num1, char math,int num2) {
		if(math == '+') {
			System.out.printf("%d %c %d = %d", num1, math, num2, num1+num2);
		}else if(math == '-') {
			System.out.printf("%d %c %d = %d", num1, math, num2, num1-num2);
		}else if(math == '*') {
			System.out.printf("%d %c %d = %d", num1, math, num2, num1*num2);
		}else if(math == '/') {
			System.out.printf("%d %c %d = %d", num1, math, num2, num1/num2);
		}else {
			System.out.printf("%d %c %d = %d", num1, math, num2, 0);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		char operation = sc.next().charAt(0);
		int inp2 = sc.nextInt();
		sc.close();
		
		Main m = new Main();
		m.math(inp1, operation, inp2);
	}
}