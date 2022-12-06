package q135;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		int sum = 0, count = 0;;
		double avg = 0;
		
		if(inp1 > inp2) {
			int tmp = inp1;
			inp1 = inp2;
			inp2 = tmp;
		}
		
		for(int i = inp1; i <= inp2; i++) {
			if(i % 3 == 0 || i % 5 ==0) {
				sum += i;
				count++;
			}
		}
		avg = (double) sum / count;
		
		System.out.printf("sum : %d\navg : %.1f\n", sum, avg);
	}
}
