package q128;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		// 3. do-while
		int inp;
		do {
			inp = sc.nextInt();
			if(!(inp % 3 == 0 || inp % 5 == 0)) {
				count++;
			}
		}while(inp != 0);
		sc.close();
		
		// 2. while
//		while(true) {
//			int inp = sc.nextInt();
//			if(inp == 0) {
//				sc.close();
//				break;
//			} else if(!(inp % 3 == 0 || inp % 5 == 0)) {
//				count++;
//			} 
//		}
		
		// 1. for
//		for(;;) {
//			int inp = sc.nextInt();
//			if(inp == 0) {
//				sc.close();
//				break;
//			} else if(!(inp % 3 == 0 || inp % 5 == 0)) {
//				count++;
//			}
//		}
		
		System.out.println(count);
	}
}
