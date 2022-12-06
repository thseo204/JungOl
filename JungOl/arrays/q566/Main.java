package q566;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int[] num = new int[30];
		int i = 0;
		
		// 방법 1. 입.출력 같이 하기
//		if(0 <= inp && inp <= 100) {
//			num[0] = 100;
//			num[1] = inp;
//			System.out.print(num[0] + " " + num[1] + " ");
//			for(int i = 0; i < num.length; i++) {
//				num[i+2] = num[i] - num [i+1];
//				
//				System.out.print(num[i + 2] + " ");
//				if(num[i+2] < 0) {
//					sc.close();
//					break;
//				}
//			}
//		}
		
		// 방법 2. 입.출력 구분짓기
		if(0 <= inp && inp <= 100) {
			num[0] = 100;
			num[1] = inp;
			for(i = 0; i < num.length - 1; i++) {
				num[i+2] = num[i] - num [i+1];
				
				if(num[i+2] < 0) {
					sc.close();
					break;
				}
			}
		}
		
		for(int j = 0; j <= i + 2; j++) {
			System.out.print(num[j] + " ");
		}
		
	}
}
