package q527;

import java.util.Scanner;

class Divide{
	private int num1;
	private int num2;
	
	public Divide(int num1, int num2) {
		// Divide 클래스의 생성자로 인스턴스 생성과 동시에 입력받은 값으로 멤버변수 초기화.
		this.num1 = num1;
		this.num2 = num2;
	}
	// 멤버변수를 private 접근 제어자로 접근을 제한하여 get()를 통해서 접근할 수 있도록 get()생성.
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public int printIntDiv() {
		// Int 타입 멤버변수를 형변환 없이 나누기 연산을 하여 
		// 몫을 Int 타입 div 변수에 담아 Int 타입의 div 변수값 리턴하는 메서드.
		int div = getNum1() / getNum2();
		return div;
	}
	
	public double printDoubleDiv() {
		// Int 타입 멤버변수 중 첫번째 수를 Double 타입 실수형태로 형변환을 하여 준 후
		// 나누기 연산을 하여 소숫점 아래까지 값을 받을 수 있도록 하여줌.
		// 연산한 값을 Double 타입의 div 변수에 담아 실수형으로 반환하는 메서드.
		double div = (double)getNum1() / getNum2();
		return div;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt(); // 스캐너를 사용하여 Int 타입으로 2개의 정수를 입력받음.
		sc.close();
		
		Divide div = new Divide(inp1, inp2); 
		//Divide 클래스 타입으로 div 참조변수를 선언하고 Divide 인스턴스를 생성함과 동시에 입력받은 Int 값으로 멤버변수 초기화함.
		System.out.printf("%d %.2f",div.printIntDiv(), div.printDoubleDiv());
		//Divide 클래스로 선언한 참조변수 div로 Divide 클래스 내의 메소드를 출력.
	}
}
