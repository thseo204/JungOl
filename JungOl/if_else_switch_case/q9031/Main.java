package q9031;

import java.util.Scanner;

class MaxMin {
	private int num1;
	private int num2;
	
	public MaxMin() {
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
	}
	
	public void print() {
		if(num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.", num2, num1);
	}
}

public class Main {
	public static void main(String[] args) {
		MaxMin mm = new MaxMin();
		mm.print();
	}
}
