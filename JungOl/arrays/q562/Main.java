package q562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum1 = 0, sum2 = 0;
		int count = 0;
		double avg = 0;
		int[] inp = new int[10]; 
		
		for(int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
			if(i % 2 == 1) {
				sum1 += inp[i];
			} else {
				sum2 += inp[i];
				count++;
			}
		}
		sc.close();
		
		// 선생님 코드
//		for(int i = 0; i < inp.length; i += 2) { // 홀수번째 수 
//			sum1 += inp[i];
//		}
//		for(int i = 1; i < inp.length; i += 2) { // 짝수번째 수
//			sum2 += inp[i];
//		}
		
		avg = (double)sum2 / count;
		System.out.printf("sum : %d\navg : %.1f", sum1, avg);
	}
}
