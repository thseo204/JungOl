package q571;

import java.util.Scanner;

// 내가 작성(처음 작성한 것.)
public class Main {
	String str = "~!@#$^&*()_+|";

//	Main(){
//		
//	} // 해당 클래스의 기본 생성자를 만들어야 하나요?

	public void string(int inp) {
		for (int i = 0; i < inp; i++) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		Main specialChar = new Main(); // 인스턴스 생성 안해도 되나요?
		specialChar.string(inp);
	}
}
