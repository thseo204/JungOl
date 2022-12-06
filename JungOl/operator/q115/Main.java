package q115;

import java.util.Scanner;

class Student {
	private StuInfo[] stu;
	private int index = 0;

	public Student(int index) {
		stu = new StuInfo[index];
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new StuInfo();
		}
	}

	public void setStudent(int height, int weight) {
		stu[index++].setStuInfo(height, weight);
	}

	public boolean compare() {
		boolean compare = false;
		for (int i = 1; i < stu.length; i++) {
			if (stu[0].getHeight() > stu[i].getHeight() && stu[0].getWeight() > stu[i].getWeight()) {
				compare = true;
			} else {
				compare = false;
			}
		}
		return compare;
	}
}

class StuInfo {
	private int height;
	private int weight;

	public void setStuInfo(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 2;
		Student stu = new Student(index);
		for (int i = 0; i < index; i++) {
			int height = sc.nextInt();
			int weight = sc.nextInt();
			stu.setStudent(height, weight);
		}
		sc.close();

		System.out.println(stu.compare());
	}
}
