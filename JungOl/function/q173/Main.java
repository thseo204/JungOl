package q173;

import java.util.Scanner;

class Square{
	private int num1;
	private int num2;
	
	public Square(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public int printValue() {
		int value = 0;
		if(getNum1() > getNum2()) {
			value = (getNum1() * getNum1()) - (getNum2() * getNum2());
		} else {
			value = (getNum2() * getNum2()) - (getNum1() * getNum1());
		}
		return value;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2];
		for (int i = 0; i < num.length; i++) {
			int inp = sc.nextInt();
			if (0 < inp) {
				num[i] = inp;
			} else {
				i--;
				continue;
			}
		}
		sc.close();
		
		Square sq = new Square(num[0], num[1]);
		System.out.println(sq.printValue());
	}
}
