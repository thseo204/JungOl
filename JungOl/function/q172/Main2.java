package q172;

import java.util.Scanner;

class Square{
	private int num;
	
	public Square() {
		Scanner sc = new Scanner(System.in);
		this.num = sc.nextInt();
		sc.close();
	}
	
	public void print() {
		for(int i = 1; i <= num; i++) {
			for(int j = 1, k = i; j <= num; j++, k += i) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}

public class Main2 {
	public static void main(String[] args) {
		Square sq = new Square();
		sq.print();
	}
}
