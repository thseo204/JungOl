package q171;

import java.util.Scanner;

class AccumulateSum1{
	private int num;
	private int sum;
	
	public AccumulateSum1(int inp) {
		num = inp;
		setSum();
	}
	
	public void setSum() {
		for(int i = 1; i <= num; i++) {
			this.sum += i;
		}
	}
	
	public int getSum() {
		return sum;
	}
	// 재귀함수 이용하여 푼 코드.
//	public int sum(int n) {
//		int res = 0;
//		if (n == 1) {
//		res = res + 1;
//		} else {
//			res = n + sum(n - 1);
//		}
//		return res;
//	}
	
}

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		AccumulateSum1 ac = new AccumulateSum1(inp);
		System.out.println(ac.getSum());
	}
}
