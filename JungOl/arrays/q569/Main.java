package q569;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][4];
		double[] avg = new double[5];
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = sc.nextInt(); 
				sum += score[i][j];
			}
			avg[i] = (double)sum / score.length;
		}
		sc.close();
		
		int passCount = 0;
		for(int i = 0; i < score.length; i++) {
			if(avg[i] >= 80) {
				System.out.println("pass");
				passCount++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("Successful : " + passCount);
	}
}
