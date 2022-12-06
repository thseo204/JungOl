package q155;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = {'J', 'U', 'N', 'G', 'O', 'L'};
		
		char inp = sc.next().charAt(0);
		sc.close();
		
		if(inp == c[0]) {
			System.out.println(0);
		} else if(inp == c[1]) {
			System.out.println(1);
		} else if(inp == c[2]) {
			System.out.println(2);
		} else if(inp == c[3]) {
			System.out.println(3);
		} else if(inp == c[4]) {
			System.out.println(4);
		} else if(inp == c[5]) {
			System.out.println(5);
		} else {
			System.out.println("none");
		}
		
	}
}
