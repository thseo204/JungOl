package q521;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int num1 = a++;
		int num2 = --b;
		
		int mul = num1 * num2;
		num1 = a;
		
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		System.out.println(mul);
//		System.out.printf("%d %d %d", num1, num2, mul);	
	}
}
