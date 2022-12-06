package q537;

import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int i = 1;
		int sum = 0;
		
		// 1. while loop
		while (i <= num) {
			sum = sum + i;
			i++;
			//sum += i++; 로 쓸 수 있음
		}
		System.out.println(sum);
		
		// 2. for loop
		for(int j=1;j<=num;j++) {
			sum += j;
		}
		System.out.println(sum);
		
		// 3. do-while loop
		do {
			sum += i;
			i++;
			//sum += i++; 로 쓸 수 있음
		}while(i<=num);
		System.out.println(sum);
	}

}
