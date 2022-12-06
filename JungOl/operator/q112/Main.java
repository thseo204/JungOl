package q112;

import java.util.Scanner;

class MyMath {
	private int num1;
	private int num2;
	private int share;
	private int remainder;
	
	public MyMath(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return this.num1;
	}

	public int getNum2() {
		return this.num2;
	}
	public int getshare() {
		this.share = getNum1() / getNum2();
		return this.share;
	}
	public int getRemainder() {
		this.remainder = getNum1() % getNum2();
		return this.remainder;
	}
	
	public void printDiv() {
		System.out.printf("%d / %d = %d...%d", 
				getNum1(), getNum2(), getshare(), getRemainder());
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		MyMath mm = new MyMath(inp1, inp2);
		mm.printDiv();
	}
}
