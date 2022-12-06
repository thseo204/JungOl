package q111;

import java.util.Scanner;

class Subject {
	private int sum;
	private int avg;

	public Subject() {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[4];
		for (int i = 0; i < 4; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		sc.close();
		avg = sum / score.length;
	}

	public void print() {
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
	}

}

public class Main2 {
	public static void main(String[] args) {
		Subject sj = new Subject();
		sj.print();
	}
}
