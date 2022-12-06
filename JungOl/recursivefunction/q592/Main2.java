package q592;

import java.util.Scanner;

class RecursiveFunction1{
	private int num;
	
	public RecursiveFunction1() {
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
			result = num * num;
		} else {
			result = (num % 10) * (num % 10) + print(num / 10); 
		}
		return result;
	}
}

public class Main2 {
	public static void main(String[] args) {
		RecursiveFunction1 rf = new RecursiveFunction1();
		int result = rf.print(rf.getNum());
		System.out.println(result);
	}
}
