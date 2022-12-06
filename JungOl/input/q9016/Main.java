package q9016;

import java.util.Scanner;

class UserInfo{
	private int height;
	private double weight;
	private char name;
	
	public UserInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요. ");
		int height = sc.nextInt();
		System.out.print("몸무게를 입력하세요. ");
		double weight = sc.nextDouble();
		System.out.print("이름을 입력하세요. ");
		char name = sc.next().charAt(0);
		sc.close();
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	
	public void print() {
		System.out.printf("키 = %d\n몸무게 = %.1f\n이름 = %c\n", height, weight, name);
	}
}

public class Main {
	public static void main(String[] args) {
		UserInfo u = new UserInfo();
		u.print();
	}
}
