package q199;

import java.util.Scanner;

class Student{
	private String name;
	private int score1;
	private int score2;
	private int score3;
	
	public void setStudent(String name, int score1, int score2, int score3) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	
	public int getStudentSum() {
		int sum = score1 + score2 + score3;
		return sum;
	}
	
	public String getName() {
		return this.name;
	}
	public int getScore1() {
		return this.score1;
	}
	public int getScore2() {
		return this.score2;
	}
	public int getScore3() {
		return this.score3;
	}
	
}

class OrderSum{
	private Student[] stu;
	private int index = 0;
	private int[] sum;
	
	public OrderSum(int num) {
		stu = new Student[num];
		for(int i = 0; i < num; i++) {
			stu[i] = new Student();
		}
		sum = new int[num];
	}
	
	public void setOrderSum(String name, int score1, int score2, int score3) {
		stu[index].setStudent(name, score1, score2, score3);
		sum[index] = stu[index].getStudentSum();
		index++;
	}
	
	public void printOrderSum() {
		for(int i = 1; i < stu.length; i++) {
			for(int j = 0; j < stu.length; j++) {
				if(sum[i] > sum[j]) {
					Student tmp = new Student();
					tmp = stu[i];
					stu[i] = stu[j];
					stu[j] = tmp;
					
					int sumtmp = sum[i];
					sum[i] = sum[j];
					sum[j] = sumtmp;
				}
			}
		}

		for(int i = 0; i < stu.length; i++) {
			System.out.printf("%s %d %d %d %d\n", 
					stu[i].getName(), stu[i].getScore1(), stu[i].getScore2(), stu[i].getScore3(), sum[i]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		OrderSum or = new OrderSum(input);
		
		for(int i = 0; i < input; i++) {
			String name = sc.next();
			int score1 = sc.nextInt();
			int score2 = sc.nextInt();
			int score3 = sc.nextInt();
			or.setOrderSum(name, score1, score2, score3);
		}
		sc.close();
		
		or.printOrderSum();
	}
}
