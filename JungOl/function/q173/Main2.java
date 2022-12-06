package q173;

import java.util.Scanner;

class Function{
	private int num1;
	private int num2;
	
	public Function(int num1, int num2) {
		this.num1 = num1 * num1;
		this.num2 = num2 * num2;
	}
	
	public int resultSub() {
		int result = num1 > num2 ? num1 - num2 : num2 - num1; 
		return result;
	}
}

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		Function f = new Function(num1, num2);
		System.out.println(f.resultSub());
	}
}
