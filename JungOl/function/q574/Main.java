package q574;

import java.util.Scanner;

public class Main {
	public int max(int[] num) { // inp 배열의 참조 변수 값을 num 배열에 주소 저장
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			max = max > num[i] ? max : num[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[3];

		for (int i = 0; i < 3; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		Main m = new Main();
		int max = m.max(inp); // inp 배열의 참조 변수 값을 num 배열에 주소 저장

		System.out.println(max);
	}
}
