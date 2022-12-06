package q632;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();

//		int min1 = n1 < n2 ? n1 : n2;
//		int min2 = n3 < min1 ? n3 : min1;
//		
//		System.out.println(min2);
		int min1=0;
		if (n1<n2) {
			min1 = n1;
			if (min1 <n3) {
				System.out.println(min1);
			}else {
				System.out.println(n3);
			}
		}else {
			min1 = n2;
			if (min1 <n3) {
				System.out.println(min1);
			}else {
				System.out.println(n3);
			}
		}
	}
}
