package q534;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char cap = sc.next().charAt(0);
		sc.close();

		if (cap == 'A') {
			System.out.println("Excellent");
		} else if (cap == 'B') {
			System.out.println("Good");
		} else if (cap == 'C') {
			System.out.println("Usually");
		} else if (cap == 'D') {
			System.out.println("Effort");
		} else if (cap == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
		// String 타입인 문자열로 입력 받을 경우. 
		// cap == "A" 으로 비교가 안됌!
		// 그래서 문자열 (변수명).equals(" ") 이 클래스로 비교해야함.
		
		switch (cap) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Usually");
			break;
		case 'D':
			System.out.println("Effort");
			break;
		case 'F':
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
			break;
		}
	}
}