package q9106;

import java.util.Scanner;

class RecursiveFunction{
	private int[] num = new int[50];
	private int count = 0;
	
	public RecursiveFunction() {
		num[0] = 1;
		num[1] = 1;
	}
	
//	public int getNum() {
//		return num;
//	}
	
	public int getRf(int num) {
		this.num[count] = num;
		int result = 0;
		
		if (num > 50) {
			result = 0;
		}else if(count == 1){
			System.out.println(this.num[0] + " " + this.num[1]);
			result = this.num[count] + this.num[count+1] + getRf(this.num[count] + this.num[count + 1]);
			count += 2;
		} else {
			System.out.println(this.num[count] + " ");
			result = this.num[count] + getRf(this.num[count-1] + this.num[count]);
			count++;
		}
		return result;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		RecursiveFunction rf = new RecursiveFunction();
		int result = rf.getRf(inp);
		System.out.println(result);
	}
}
