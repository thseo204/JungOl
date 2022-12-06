package q129;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float cm1 = 0;
		float cm2 = 0;
		float width = 0.0f;
		do {
			System.out.print("Base = ");
			cm1 = sc.nextFloat();
			System.out.print("Height = ");
			cm2 = sc.nextFloat();
			
			width = (cm1 * cm2) / 2;
			System.out.printf("Triangle width = %.1f\n", width);
			
			System.out.print("Continue? ");
			char answer = sc.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				continue;
			} else {
				sc.close();
				break;
			}
		}while(true);
	}
}
