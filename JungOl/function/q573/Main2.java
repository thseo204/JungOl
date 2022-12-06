package q573;

import java.util.Scanner;

public class Main2 {
	int[][] square;

	public void square(int inp) {
		this.square = new int[inp][inp];
	}

//	public int[][] arrPrint(int inp) { 
	// 이 메서드 안에 있는 지역변수를 반환하고 싶을 경우 void를 쓰지 않고 이렇게 써서 
	public void arrPrint(int inp) {
		for (int i = 0, num = 1; i < inp; i++) {
			for (int j = 0; j < inp; j++) {
				square[i][j] = num++;
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
//		return square;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		Main2 arr = new Main2();
		
		arr.square(inp);
//		int[][] ar = arr.arrPrint(inp);
		// 이 메서드 안에서 사용하였던 지역변수를 받을 변수를 새로 선언해서 받아서 출력하기!
		arr.arrPrint(inp);
	}
}
