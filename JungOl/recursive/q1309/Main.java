package q1309;

import java.util.Scanner;

class Factorial {

	public long result(int n) {
		if (n == 1) {
			System.out.printf("%d! = %d\n", n, n);
			return 1;
		}
		System.out.printf("%d! = %d * %d!\n", n, n, n - 1);
		return n * result(n - 1);
	}
	
//	public void print() {
//		for(int i = n; i > 0; i--) {
//			if(i == 1) {
//				System.out.printf("%d! = %d\n", i, i);
//				return;
//			}
//			System.out.printf("%d! = %d * %d!\n", i, i, i-1);
//		}
//	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		Factorial fac = new Factorial();
//		fac.print();
		System.out.println(fac.result(n));
	}
}
