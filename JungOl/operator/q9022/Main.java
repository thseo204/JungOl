package q9022;

import java.util.Scanner;

class MyMath{
	private int a;
	private int b;
	private int c;
	
	public MyMath(int a, int b) {
		this.a = ++a;
		b--;
		this.b = b;
		this.c = ++a + b--;
	}
	
	public void print() {
		System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		MyMath mm = new MyMath(inp1, inp2);
		mm.print();
	}
}
