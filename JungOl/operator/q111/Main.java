package q111;

import java.util.Scanner;

class MyMath{
	private int kor;
	private int eng;
	private int math;
	private int com;
	private int sum;
	private double avg;
	
	public MyMath(int kor, int eng, int math, int com){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	public int getCom() {
		return this.com;
	}
	public int getSum() {
		this.sum = getKor() + getEng() + getMath() + getCom();
		return this.sum;
	}
	public double getAvg() {
		this.avg = getSum() / 4;
		return this.avg;
	}
	
	public void printSum() {
		System.out.println("sum " + getSum());
	}
	
	public void printAvg() {
		System.out.printf("avg %.0f", getAvg());
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int com = sc.nextInt();
		sc.close();
		
		MyMath mm = new MyMath(kor, eng, math, com);
		mm.printSum();
		mm.printAvg();
	}
}
