package q632;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
//		if (num1 < num2 && num1 < num3) {
//			System.out.println(num1);
//		} else if (num2 < num1 && num2 < num3) {
//			System.out.println(num2);
//		} else {
//			System.out.println(num3);
//		}
		
		int min = (num1 < num2) ? num1 : num2;
		// 입력 값 18 9 2 일때
		//18 < 9 가 맞으면 18 : 아니면 9 니까 min=9
		int min2 = (min < num3) ? min : num3;
		// 9 < 2 ? 맞으면 min 출력 : 아니면 num3 출력 이니까
		// min2 는 num3인 2 출력됨.
		
		System.out.println(min2);
		
//		int min3 = (num1> num2) ? ((num2>num3)? num3:num2): ((num1>num3 ? num3 :num1)); 
	}
}
