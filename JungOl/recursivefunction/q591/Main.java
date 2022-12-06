package q591;

import java.util.Scanner;

class RecursiveFunction{
	private int n;
	private int[] num = new int[100];
	
//	public RecursiveFunction(int n) {
//		this.n = n;
//	}
	
	public int getN() {
		return num[n];
	}
	
//	public void setNum() {
//		num[0] = 1;
//		for(int i = 1; i < num.length; i++) {
//			num[i] = num[i/2] + num[i-1]; 
//		}
//	}
	
	public int printRecur(int n) {
//		this.setNum();
		int result = 0;
		if(n == 0) {
			num[n] = 1;
			return num[n];
		}
		n--;
		num[n] = num[n/2] + printRecur(num[n-1]);
		result = n;
		
		return num[result];
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		RecursiveFunction rf = new RecursiveFunction();
		int result = rf.printRecur(n);
		System.out.println(result);
	}
}
