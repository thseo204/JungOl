package q116;

import java.util.Scanner;

class Score{
	private int score1;
	private int score2;
	private int score3;
	
	public Score(int score1, int score2, int score3) {
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	
	public int getScore1() {
		return score1;
	}
	public int getScore2() {
		return score2;
	}
	public int getScore3() {
		return score3;
	}
	
	public void avg(){
		double avg = (double)(getScore1() + getScore2() + getScore3()) / 3;
		System.out.printf("%.1f", avg);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subject1 = sc.nextInt();
		int subject2 = sc.nextInt();
		int subject3 = sc.nextInt();
		sc.close();
		
		Score s = new Score(subject1, subject2, subject3);
		s.avg();
	}
}
