package q120_math.abs;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		// 2nd . 절대값(부호를 빼버리는 것 양수도 양수로 음수도 양수로만듬) 메서드를 활용한 방법.
		System.out.println(Math.abs(n1-n2));
		
		// 1st
		if(n1 > n2) {
			System.out.println(n1 - n2);
		}else {
			System.out.println(n2 - n1);
		}
	}
}
