package q126;

import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp;
		int add = 0, even = 0;
		
		do {
			inp = sc.nextInt();
			if(inp % 2 == 0 && inp != 0) {
				even++;
			} else if(inp % 2 == 1) {
				add++;
			}
		}while(inp != 0);
		sc.close();
		
		System.out.printf("odd : %d\neven : %d\n", add, even);
	}
}
