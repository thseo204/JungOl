package q535;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		sc.close();

		// 1. switch 문
		int avg = (int) score;

		System.out.println(avg);
		if (0 <= avg && avg >= 4.5) {
			switch (avg) {
			case 4:
				System.out.println("scholarship");
				break;
			case 3:
				System.out.println("next semester");
				break;
			case 2:
				System.out.println("seasonal semester");
				break;
			default:
				System.out.println("retake");
				break;
			}
		}

		// 2. if-else 문
//		if (score >= 4.0 ) {
//			System.out.println("scholarship");			
//		} else if (score >= 3.0) {
//			System.out.println("next semester");
//		}else if (score >= 2.0) {
//			System.out.println("seasonal semester");			
//		}else {
//			System.out.println("retake");			
//		}
	}
}