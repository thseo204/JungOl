package q588;

import java.util.Scanner;

class RecursiveFunction{
	public int printRF(int inp) {
		int result = 0;
		if(inp == 1) {
			result = 1;
			System.out.print(result + " ");
		} else {
			System.out.print(inp + " ");
			result = inp + printRF(inp - 1);
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
		rf.printRF(inp);
	}
}