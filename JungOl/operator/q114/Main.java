package q114;

import java.util.Scanner;

class InDecrease{
	private int num1;
	private int num2;
	
	public InDecrease(int num1, int num2) {
		this.num1 = ++num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2--;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		InDecrease id = new InDecrease(inp1, inp2);
		System.out.println(id.getNum1() + " " + id.getNum2());
		System.out.println(id.getNum1() + " " + id.getNum2());
	}
}
