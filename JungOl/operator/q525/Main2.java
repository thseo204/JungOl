package q525;

import java.util.Scanner;
// 동구씨 코드
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] inp = new int[3];
		
		for(int i = 0; i < inp.length; i++) {
			inp[i]= sc.nextInt();
		}
		sc.close();
		
		boolean bol1 = inp[0] > inp[1] && inp[0] > inp[2];
		boolean bol2 = inp[0] == inp[1] && inp[0] == inp[2];
		System.out.println(bol1 + " " + bol2);
	}
}
