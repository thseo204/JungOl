package q9104;

import java.util.Scanner;

class RecursiveFunction{
	private int num;
	
	public RecursiveFunction() {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		num = inp;
	}
	
	public int getNum() {
		return num;
	}
	
	public int print(int num) {
		int result = 0;
		if(num < 10) {
			result = num;
		} else {
			result = num % 10 + print(num / 10);
		}
		return result;
	}
}

public class Main {
	public static void main(String[] args) {
		RecursiveFunction rf = new RecursiveFunction();
		int result = rf.print(rf.getNum());
		System.out.println(result);
	}
}
