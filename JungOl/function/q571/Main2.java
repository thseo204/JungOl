package q571;

import java.util.Scanner;
// 선생님이 작성한것.
// 첫 설명이라 인스턴스 생성 안하심. But 꼭필요한 상황이 아니라면 static을 붙이는 것은 메모리 낭비이며
// 해당 클래스의 인스턴스 생성을 한 후 사용할 것. 
public class Main2 {
	public static void printStr() { 
		// static이 붙어 있으면 프로그램이 시작과 동시에 프로그램이 끝날때까지
		// 아래 메서드의 내용이 메모리에 바로 올라가서 바로 호출할 수 있는 상황이 됨. 
		System.out.println("~!@#$^&*()_+|");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for(int i = 0; i < num; i++) {
			printStr();
		}
	}
}
