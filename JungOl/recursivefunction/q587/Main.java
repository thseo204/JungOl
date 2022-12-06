package q587;

import java.util.Scanner;

class RecursiveFunction{
	
	public String printRF(int inp) {
		String result = "recursive";
		if(inp == 1) {
			System.out.println("recursive");
		} else {
			System.out.println("recursive");
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