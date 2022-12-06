package q617;

import java.util.Scanner;

class Student{
	private String name;
	private int height;
	
	public Student(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String printStu() {
		return name + " " + height;
	}
	
}

class MinHeight1{
	private Student[] stu = new Student[5];
	private int min;
	
	public MinHeight1() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			stu[i] = new Student(name, height);
		}
		sc.close();
	}
	
	public void setMin() {
		min = Integer.MAX_VALUE;
		for(int i = 0; i < stu.length; i++) {
			min = min < stu[i].getHeight() ? min : stu[i].getHeight();
		}
	}
	
	public void printMin() {
		for(int i = 0; i < stu.length; i++) {
			if(min == stu[i].getHeight()) {
				stu[i].printStu();
			}
		}
	}
}

public class Main3 {
	public static void main(String[] args) {
		MinHeight1 min = new MinHeight1();
		min.setMin();
		min.printMin();
	}
}
