package q540;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp;
		
		do {
			inp = sc.nextInt();
			if(inp % 3 != 0) {
				continue;
			} else if(inp != 0 && inp % 3 == 0) {
				inp /= 3;
				System.out.println(inp);
			} 
		} while(inp != -1);
		sc.close();
	}
}