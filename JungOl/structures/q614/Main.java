package q614;

import java.util.Scanner;

public class Main {
	private String school;
	private int grade;
	
	public Main() {
		
	}
	
	public Main(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	 
	public void setStudent(String school, int grade) { //생성자와 코드중복?
		this.school = school;
		this.grade = grade;
	}
	
	public void getStudent() {
		System.out.printf("%d grade in %s School\n", this.grade, this.school);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Main stu1 = new Main("Jejuelementary", 6);
		Main stu2 = new Main();
		
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		stu1.getStudent();
		stu2.setStudent(school, grade);
		stu2.getStudent();
		
	}
}
