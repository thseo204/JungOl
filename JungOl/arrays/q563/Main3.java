package q563;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];

		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		
		int[] tmp = new int[10];
		int[] max1 = new int[10];
		int max = 0;
		for(int j = 0; j < num.length-1; j++) {
			for(int i = 0 + j; i < num.length; i++) {
				max1[j] = max > num[i] ? max : num[i];
				if(i == 9) {
					tmp[j]= max1[i]; 
				}
			}
			for(int i = 0 + j; i < num.length; i++) {
				tmp[i]= max1[j]; 
			}
		}
		sc.close();
		
		for(int i = 0; i < tmp.length; i++) {
			System.out.printf("%d ", tmp[i]);
		}
	}
}
