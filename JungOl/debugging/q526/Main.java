package q526;

import java.util.Scanner;

class Multiply{
	private double num1;
	private double num2;
	
	public Multiply(double num1, double num2) { 
		// 인스턴스 생성과 동시에 받은 Double 타입 입력값으로 멤버변수 초기화
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double getNum1() { 
		// 멤버변수가 private 접근 제어자로 접근이 제한되어지니 get메서드를 활용하여 멤버변수에 접근.
		return num1;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public int printDoubleMul() {
		// Double 타입의 멤버변수 num1과 num2를 곱한 후 Integer 타입으로 형변환 시켜 받은 
		// int 타입의 mul 변수 값 리턴하는 메서드.
		int mul = (int)(getNum1() * getNum2());
		return mul;
	}
	
	public int printIntMul() {
		// Double 타입의 멤버변수 num1과 num2를 각각 Integer 타입으로 형변환 시킨 후 곱한 값을 받은
		// int 타입의 mul 변수 값 리턴하는 메서드.
		int mul = (int)(getNum1()) * (int)(getNum2());
		return mul;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp1 = sc.nextDouble(); 
		double inp2 = sc.nextDouble();
		// 실수타입인 Double 타입으로 inp1 변수와 inp2 변수를 스캐너를 통해 입력받음.
		sc.close();
		
		// Multiply 클래스 타입의 참조변수 mul 을 선언하여 Multiply 인스턴스 생성.
		Multiply mul = new Multiply(inp1, inp2); //  인스턴스 생성과 동시에 생성자를 통해 멤버변수 값 초기화.
		System.out.println(mul.printDoubleMul() + " " + mul.printIntMul());
		// Multiply 클래스의 참조변수인 mul.을 활용하여 Multiply 내에 있는 메서드 호출하여 리턴 값 출력
	}
}
