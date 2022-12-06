package q539;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = 0;
		int sum = 0, count = 0;
		double avg = 0.0;
		
		do {
			inp = sc.nextInt();
			sum += inp;
			count++;
		} while (inp < 100);
		sc.close();
		
		avg = (double)sum / count;
		
		System.out.printf("%d\n%.1f", sum, avg);
		
		//----------------------------------------------
//		int inp1 = 0;
//		for(;;) {
//			inp1 = sc.nextInt();
//			sum += inp1;
//			count++;
//			if(inp1 >= 100) {
//				sc.close();
//				break;
//			} 
//		}
//		avg = (double)sum / count;
//		
//		System.out.printf("%d\n%.1f", sum, avg);
	}
}