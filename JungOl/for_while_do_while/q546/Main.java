package q546;

import java.util.Scanner;

class Score{
	private int[] score;
	private int n;
	private double avg;
	
	public Score() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			score = new int[n];
		}
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void setAvg() {
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		this.avg = (double) sum / score.length;
	}
	
	public double getAvg() {
		return avg;
	}
}

class PassOrFail extends Score{
	public PassOrFail() {
		super();
	}
	
	public void print() {
		System.out.printf("avg : %.1f\n", super.getAvg());
		if(super.getAvg() >= 80) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		PassOrFail pf = new PassOrFail();
		pf.setAvg();
		pf.print();
	}
}
