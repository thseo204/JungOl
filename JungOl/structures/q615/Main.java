package q615;

import java.util.Scanner;

class StuScore {
	private String[] name;
	private int[] korScore;
	private int[] engScore;
	private int korAvg;
	private int engAvg;

	public StuScore(String[] name, int[] korScore, int[] engScore) { 
		// 배열 레퍼런스 변수의 주소값을 레퍼런스 변수에 옮겨주기!
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
	}

	public void getStuInfo() {
		for (int i = 0; i < this.name.length; i++) {
			System.out.printf("%s %d %d\n", this.name[i], this.korScore[i], this.engScore[i]);
		}
	}

	public int korAvg() {
		int sum = 0;
		for (int i = 0; i < this.korScore.length; i++) {
			sum += this.korScore[i];
		}
		this.korAvg = sum / korScore.length;
		return this.korAvg;
	}

	public int engAvg() {
		int sum = 0;
		for (int i = 0; i < this.engScore.length; i++) {
			sum += this.engScore[i];
		}
		this.engAvg = sum / engScore.length;
		return this.engAvg;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[2];
		int[] korScore = new int[2];
		int[] engScore = new int[2];

		for (int i = 0; i < name.length; i++) {
			name[i] = sc.next();
			korScore[i] = sc.nextInt();
			engScore[i] = sc.nextInt();
		}
		sc.close();

		StuScore stu1 = new StuScore(name, korScore, engScore);

		int korAvg = stu1.korAvg();
		int engAvg = stu1.engAvg();

		stu1.getStuInfo();
		System.out.printf("avg %d %d\n", korAvg, engAvg);

	}
}
