package q519;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		scanner.close();
		
//		System.out.println(input1);
//		System.out.println(input2);
		// 중간중간 출력 해보는 것 또한 하나의 디버깅이 될 수 있음.
		
		input1 = input1 + 100;
		input2 = input2 % 10;
		// 선생님이 한 것 
		
//		int num1 = input1 + 100;
//		int num2 = input2 % 10;
		// 내가 한 것
		
		System.out.println(input1 + " " + input2);
		// 선생님이 한 것 
		System.out.printf("%d %d", input1, input2);
		// 내가 한 것
	}
}
