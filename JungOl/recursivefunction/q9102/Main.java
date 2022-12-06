package q9102;

import java.util.Scanner;

class RecursiveFunction{
	public void print(int n) {
		if(n == 0) {
			return;
		} else {
			print(n - 1);
			System.out.print(n + " ");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		RecursiveFunction rf = new RecursiveFunction();
		rf.print(inp);
	}
}
