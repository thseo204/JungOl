package q518;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수값 세개를 입력 받기 위해서는 
		// 스캐너를 써야하며, 입력받는 타입이 정수 이므로 nextInt()
		
//		String input1 = sc.nextLine();
//		String input1 = sc.nextLine();
//		String input1 = sc.nextLine();
		// 위처럼 nextLine() 으로 세개를 작성하면 
		int input1 = sc.nextInt(); // 10 25 33 숫자를 스페이스로 띄어 쓰기 하여 입력하였을 경우.
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		sc.close();
		
//		int num1 = Integer.parseInt(input1);
		// input1 매개 변수에 공백, 문자, 문자열 등 정수가 아닌 수가 들어가면 int 타입으로 변환할 수 없음.
//		int num2 = Integer.parseInt(input2);
//		int num3 = Integer.parseInt(input3);
		
		int sum = input1 + input2 + input3;
//		int avg = sum / 3 ;
		double avg = (double)sum / 3 ;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		System.out.printf("avg : %.3f\n" , avg);
		// 소수점 셋째자리까지만 출력 하고자 할때
				
	}
}
