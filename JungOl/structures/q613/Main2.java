package q613;

import java.util.Scanner;

// 선생님이 작성한 코드
public class Main2 {
	private String name;
	private String school;
	private int grade;
	
	public Main2(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("grade : " + grade);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Main2 m = new Main2(name, school, grade);
		
		m.print();
	}
}
