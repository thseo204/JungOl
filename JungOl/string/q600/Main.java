package q600;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			char[] ch = str.toCharArray();
			if(ch[i]== ' ') {
				count++;
			} else {
				continue;
			}
		}
		
		System.out.println(count);
	}
}
