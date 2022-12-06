package q9103;

import java.util.Scanner;

class RecurFunction{
	public int print(int n) {
		int result = 0;
		if(n == 0) {
			return 1;
		}else {
			result = n * print(n - 1);
		}
		return result;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		RecurFunction rf = new RecurFunction();
		int result = rf.print(inp);
		System.out.println(result);
	}
}
