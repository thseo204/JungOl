package q1309;

import java.util.Scanner;
// 선생님 코드
public class Main2 {
	public static int factorial(int p) {
		System.out.print(p + "! = " + p);
		if(p == 1) {
			System.out.println();
			return 1;
		} else {
			System.out.println(" * " + (p -1) + "!");
			return p * factorial(p -1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
 
		int result = factorial(n);
		System.out.println(result);
	}
}
