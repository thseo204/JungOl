package q124;

import java.util.Scanner;

class Month{
	int month;
	
	public Month(int inp) {
		if(inp < 1 || 12 < inp) {
			return;
		} else {
			month = inp;
		}
	}
	
	public void getDays() {
		switch(month) {
		case 1: case 3: case 5: case 7: 
		case 8: case 10: case 12:
			System.out.println(31);
			break;
		case 2:
			System.out.println(28);
			break;
		default :
			System.out.println(30);
			break;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		Month m = new Month(inp);
		m.getDays();
	}
}
