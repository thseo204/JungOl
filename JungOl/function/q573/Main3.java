package q573;

import java.util.Scanner;
// 선생님 코드
public class Main3 {
	public void square(int inp) {
		int c = 1;
		for(int i = 0; i < inp; i++) {
			for(int j = 0; j < inp; j++) {
				System.out.print(c++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		Main3 arr = new Main3();
		
		arr.square(inp);
	}
}
