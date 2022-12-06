package q572;

import java.util.Scanner;
// 내가 작성한 코드
public class Main {
	double width; 
//	double radius; // 없어도 됨.
	
	public Main(){
		
	}
	
//	public double circle (double radius){ //  메인메서드에서 무언가 연산이 이루어진다면 이게 맞음.
	public void circle (double radius){
		this.width = radius * radius * 3.14;
		System.out.printf("%.2f", width);
//		return width;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		sc.close();
		
		Main c = new Main();
//		double d = c.circle(input); 
		// 위 클래스에서 받는 반환 타입을 double로 하고 return 값을 받으려면 이처럼 받는 변수를 만들어줘야함.
		c.circle(input);
	}
}
