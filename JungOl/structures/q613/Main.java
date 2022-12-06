package q613;

import java.util.Scanner;
// 내가 처음 작성한 코드. 
// 이렇게 쓰는 것보다 getset()를 활용해서 접근할 수 있도록 하는 것이 좋음! Main2 코드 참고!
public class Main {
	String name;
	String school;
	int grade;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Main m = new Main();
		m.name = sc.next();
		m.school = sc.next();
		m.grade = sc.nextInt();
		sc.close();
		
		System.out.printf("Name : %s\nSchool : %s\nGrade : %d", m.name, m.school, m.grade);
	}
}
