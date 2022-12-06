package q615;

import java.util.Scanner;

class Student1 {
	protected String name;
	protected int korScore;
	protected int engScore;

	public void setStudent(String name, int korScore, int engScore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
	}
}

class Average {
	private Student1[] stu = new Student1[2];
	private int index;

	public Average() {
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student1();
		}
	}

	public void setStuInfo(String name, int korScore, int engScore) {
		stu[index++].setStudent(name, korScore, engScore);
	}

	public void getStuInfo() {
		for (int i = 0; i < stu.length; i++) {
			System.out.printf("%s %d %d\n", stu[i].name, stu[i].korScore, stu[i].engScore);
		}
	}

	public void avgValue() {
		int korSum = 0, engSum = 0;

		for (int i = 0; i < stu.length; i++) {
			korSum += stu[i].korScore;
			engSum += stu[i].engScore;
		}
		System.out.printf("%s %d %d\n", "avg", korSum / stu.length, engSum / stu.length);
	}
}

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Average avg = new Average();

		for (int i = 0; i < 2; i++) {
			String name = sc.next();
			int korScore = sc.nextInt();
			int engScore = sc.nextInt();
			avg.setStuInfo(name, korScore, engScore);
		}
		sc.close();

		avg.getStuInfo();
		avg.avgValue();
	}
}
