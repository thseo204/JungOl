package q172;

import java.util.Scanner;

class NumberSquare{
	private int num;
	
	public NumberSquare(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void printNumSquare() {
		for(int i = 1; i <= getNum(); i++) {
			for(int j = 1, k = i; j <= getNum(); j++, k += i) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		NumberSquare ns = new NumberSquare(inp);
		ns.printNumSquare();
	}
}
