package q563;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
// 다른 방법
public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] inp = new Integer[10]; 
		// int 와 integer 타입이 다르며, Arrays.sort(inp, Collections.reverseOrder()); 는 Integer 타입으로 해야함!!
		
		for(int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(inp, Collections.reverseOrder());

		
		for(int i = 0; i < inp.length; i++) {
			System.out.print(inp[i]+ " " );
		}
	}
}
