package q157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[100];
		int count = 0, sum =0;
		double avg =0.0;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
			if (inp[i] == 0) {
				sc.close();
				break;
			}
			if (inp[i] % 5 == 0) {
				count++;
				sum += inp[i];
			}
		}
		avg = (double)sum / count;
		
		System.out.printf("Multiples of 5 : %d\nsum : %d\navg : %.1f\n", count, sum, avg);
	}
}
