package q538;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("number? ");
//		int num = sc.nextInt();

//		while (num != 0) {
//			if (num < 0) {
//				System.out.println("negative number");
//			} else if (0 < num) {
//				System.out.println("positive integer");
//			}
//			System.out.print("number? ");
//			num =sc.nextInt();
//			int num = sc.nextInt();
		// error : Duplicate local variable num. 코드가 중복 선언 되었다는 뜻.
//		}
//		sc.close();

		// 1.for 문으로 무한 루프 만들기
		for (;;) {
			System.out.print("number? ");
			int inp = sc.nextInt();
			if (inp > 0) {
				System.out.println("positive integer");
			} else if (inp < 0) {
				System.out.println("negative number");
			} else {
				sc.close();
				break;
			}
		}
		
		// 2. while 문으로 무한 루프 만들기
		while (true) {
			System.out.print("number? ");
			int n = sc.nextInt();
			if (n > 0) {
				System.out.println("positive integer");
			} else if (n < 0) {
				System.out.println("negative number");
			} else {
				sc.close();
				break;
			}
		}
		
		// 3. do-while 문으로 무한 루프 만들기
		int inp;
		do {
			System.out.println("number? ");
			inp = sc.nextInt();
			if(inp>0) {
				System.out.println("positive integer");
			} else if (inp<0) {
				System.out.println("negative number");
			}
		} while (inp != 0);
		sc.close();
	}
}