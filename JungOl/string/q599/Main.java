package q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		char[] strC = str.toCharArray();
		for (int i = 0; i < strC.length; i++) {
			if ('a' <= strC[i] && strC[i] <= 'z') {
				System.out.print((char)(strC[i] - 32));
			} else if('A' <= strC[i] && strC[i] <= 'Z' ) {
				System.out.print(strC[i]);
			} else {
				continue;
			}
			if(Character.isAlphabetic(strC[i])) {
				System.out.print(strC[i]);
				// 알파벳인지 아닌지 확인하는 메서드. 
			}
		}
		
		System.out.println(str.toUpperCase()); //  문자열 내의 소문자 영어 다 대문자로 바꾸어줌.
		System.out.println(str.toLowerCase()); //  문자열 내의 대문자 영어 다 소문자로 바꾸어줌.
		
	}
}
