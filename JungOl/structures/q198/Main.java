package q198;

import java.util.Scanner;

class Student{
	private int height;
	private double weight;
	
	public Student(int fatherH, int motherH, double fatherW, double motherW) {
		this.height = (fatherH + motherH) / 2 + 5;
		this.weight = (fatherW + motherW) / 2 - 4.5;
	}
	
	public void getStuInfo() {
		System.out.printf("height : %dcm\nweight : %.1fkg\n", this.height, this.weight);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fatherH = sc.nextInt();
		double fatherW = sc.nextDouble();
		int motherH = sc.nextInt();
		double motherW = sc.nextDouble();
		sc.close();
		
		Student stu = new Student(fatherH, motherH, fatherW, motherW);
		stu.getStuInfo();
	}
}
