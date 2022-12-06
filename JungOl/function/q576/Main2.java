package q576;

import java.util.Scanner;

class MyMath {
	private int num1;
	private int num2;
	private char operator;

	public MyMath(int num1, char operator, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public char getOperator() {
		return operator;
	}
	
	public int sum() {
		int result = getNum1() + getNum2();
		return result;
	}
	
	public int sub() {
		int result = getNum1() - getNum2();
		return result;
	}
	
	public int mul() {
		int result = getNum1() * getNum2();
		return result;
	}
	
	public double div() {
		double result = getNum1() / getNum2();
		return result;
	}
	// switch-case 문
//	public void printOperator() {
//		switch(operator) {
//		case '+':
//			System.out.printf("%d %c %d = %d\n", 
//					getNum1(), getOperator(), getNum2(), sum());
//			break;
//		case '-':
//			System.out.printf("%d %c %d = %d\n",
//					getNum1(), getOperator(), getNum2(), sub());
//			break;
//		case '*':
//			System.out.printf("%d %c %d = %d\n",
//					getNum1(), getOperator(), getNum2(), mul());
//			break;
//		case '/':
//			System.out.printf("%d %c %d = %.0f\n",
//					getNum1(), getOperator(), getNum2(), div());
//			break;
//		default :
//			System.out.printf("%d %c %d = %d\n",
//					getNum1(), getOperator(), getNum2(), 0);
//		}
//	}
	
	// if-else 문
	public void printOperator() {
		if(getOperator() == '+') {
			System.out.printf("%d %c %d = %d\n", 
					getNum1(), getOperator(), getNum2(), sum());
		} else if(getOperator() == '-') {
			System.out.printf("%d %c %d = %d\n",
					getNum1(), getOperator(), getNum2(), sub());
		} else if(getOperator() == '*') {
			System.out.printf("%d %c %d = %d\n",
					getNum1(), getOperator(), getNum2(), mul());
		} else if(getOperator() == '/') {
			System.out.printf("%d %c %d = %.0f\n",
					getNum1(), getOperator(), getNum2(), div());
		} else {
			System.out.printf("%d %c %d = %d\n",
					getNum1(), getOperator(), getNum2(), 0);
		}
	}
}

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		char operator = sc.next().charAt(0);
		int num2 = sc.nextInt();
		sc.close();
		
		MyMath mm = new MyMath(num1, operator, num2);
		mm.printOperator();
	}
}