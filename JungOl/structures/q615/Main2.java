package q615;
// 선생님 코드. 객체의 배열(레퍼런스의 배열. 참조변수의 배열). 참조변수의 배열 그림 기억하기!!
import java.util.Scanner;

class Student{
	private String name;
	private int kor;
	private int eng;
	
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
}

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] stu = new Student[2]; 
		// Student 클래스의 배열을 만듦. stu 레퍼런스 변수에는 실제 인스턴스를 가리키는 주소가 담겨있음.
		for(int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			stu[i]= new Student(name, kor, eng); // 실제 인스턴스를 만드는 부분이 여기
		}
		sc.close();
		
		for(int i = 0; i < stu.length; i++) {
			stu[i].print();
		}
		int sumKor = 0, sumEng = 0;
		for(int i = 0; i < stu.length; i++) {
			sumKor += stu[i].getKor();
			sumEng += stu[i].getEng();
		}
		
		System.out.println("avg " + sumKor / stu.length + " " + sumEng / stu.length);
	}
}
