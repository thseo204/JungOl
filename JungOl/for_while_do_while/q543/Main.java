package q543;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 2; i <= num; i = i + 2){
			System.out.print(i + " ");
		}
	}
}