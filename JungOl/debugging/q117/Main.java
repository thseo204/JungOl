package q117;

import java.util.Scanner;

class Score {
	private double score1;
	private double score2;
	private double score3;

	public Score(double score1, double score2, double score3) {
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}

	public double getScore1() {
		return score1;
	}

	public double getScore2() {
		return score2;
	}

	public double getScore3() {
		return score3;
	}

	public int sum() {
		int sum = (int) (getScore1()) + (int) (getScore2()) + (int) (getScore3());
		return sum;
	}

	public int avg() {
		int avg = (int) ((getScore1() + getScore2() + getScore3()) / 3);
		return avg;
	}

	public void printSumAvg() {
		System.out.printf("sum %d\navg %d", sum(), avg());
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double subject1 = sc.nextDouble();
		double subject2 = sc.nextDouble();
		double subject3 = sc.nextDouble();
		sc.close();

		Score sco = new Score(subject1, subject2, subject3);
		sco.printSumAvg();
	}
}
