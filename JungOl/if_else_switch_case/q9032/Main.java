package q9032;

import java.util.Scanner;

class Score {
	private int score;
	
	public Score(int score) {
		this.score = score;
	}
	
	public void resultPrint() {
		if(score >= 80) {
			System.out.println("축하합니다. 합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. ");
		int inp = sc.nextInt();
		sc.close();
		
		Score sco = new Score(inp);
		sco.resultPrint();
	}
}
