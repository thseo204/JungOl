package q151;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[5];
		int sum = 0;
		
		for(int i = 0; i < inp.length; i++) {
			inp[i]= sc.nextInt(); 
		}
		sc.close();
		
		for(int i = 0; i < inp.length; i += 2) {
			sum += inp[i];
		}
		System.out.print(sum);
	}
}
