package q171;

import java.util.Scanner;

class AccumulateSum{
	private int num;
	
	public AccumulateSum(int inp) {
		num = inp;
	}
	
	public int getNum() {
		return num;
	}
	
	public int printSum() {
		int sum = 0;
		for(int i = 1; i <= getNum(); i++) {
			sum += i;
		}
		return sum;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int num = 0;
		sc.close();
		
		if(inp <= 1000) {
			num = inp;
		}
		
		AccumulateSum ac = new AccumulateSum(num);
		System.out.println(ac.printSum());
	}
}
