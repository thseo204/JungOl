package q592;

import java.util.Scanner;

class RecursiveFunction{
	public int printRF(int inp) {
		int result = 0;
		if(inp < 10) {
			result = inp * inp;
		} else {
			result = (inp % 10) * (inp % 10)  + printRF(inp / 10);
		}
		return result;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		RecursiveFunction rf = new RecursiveFunction();
		int result = rf.printRF(inp);
		System.out.println(result);
	}
}
