package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		for(int i = 0; i < 10; i++){
			num[i] = sc.nextInt();
		}
		sc.close();
		
		int min1 = num[0];
		
		for(int i = 1; i < num.length; i++) {
			min1 = (min1 < num[i]) ? min1 : num[i];
		}
		System.out.println(min1);
	}
}
