package q9019;

import java.util.Scanner;

class Number{
	private int num;
	
	public Number(int num) {
		this.num = num;
	}
	
	public void resetNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void print() {
		System.out.print(num + " ");
	}
}

class ThreeMath{
	private Number[] n = new Number[5];
	
	public ThreeMath(){
		System.out.print("5개의 수를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < n.length; i++) {
			int inp = sc.nextInt();
			n[i] = new Number(inp);
		}
		sc.close();
	}
	
	public void setThreeMaht(){
		n[0].resetNum(n[0].getNum() + 3);
		n[1].resetNum(n[1].getNum() - 3);
		n[2].resetNum(n[2].getNum() * 3);
		n[3].resetNum(n[3].getNum() / 3);
		n[4].resetNum(n[4].getNum() % 3);
	}
	
	public void print() {
		for(int i = 0; i < n.length; i++) {
			n[i].print();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		ThreeMath tm = new ThreeMath();
		tm.setThreeMaht();
		tm.print();
	}
}
