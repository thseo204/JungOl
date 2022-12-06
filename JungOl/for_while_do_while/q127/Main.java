package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, inp = 0, i = 1;
		float avg = 0;
		
		while (0 <= inp && inp <= 100) {
			inp = sc.nextInt();
			if (!(0 <= inp && inp <= 100)) {
				sc.close();
				break;
			}
			sum += inp;
			avg = (float) sum / i++;
//			i++;
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}
}
