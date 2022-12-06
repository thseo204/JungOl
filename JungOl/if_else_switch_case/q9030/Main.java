package q9030;

import java.util.Scanner;

class NumberCom {
	private int num;

	public NumberCom() {
		Scanner sc = new Scanner(System.in);
		this.num = sc.nextInt();
		sc.close();
	}

	public void print() {
		System.out.println(num);
		if (num > 10) {
			System.out.println("10보다 큰 수를 입력하셨습니다.");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		NumberCom nc = new NumberCom();
		nc.print();
	}
}
