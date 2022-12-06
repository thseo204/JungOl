package q520;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		// nextLine() = 입력받은 줄, 전체 한줄을 다 입력 받겠다.
		// Scanner sc = new Scanner(System.in);
		// int i = sc.nextInt(); 입력받은 값이 int 임을 알고 있을 경우 사용
		// 이렇게 하면 변환 코드 한줄을 생략할 수 있음.
		scanner.close();
		
		int i = Integer.parseInt(input);
		
//		System.out.println(i++);
//		System.out.println(++i);
		
		int sum1 = i++;
		int sum2 = ++i;
		
		System.out.println(sum1);
		System.out.println(sum2);
		
		
	}
}
