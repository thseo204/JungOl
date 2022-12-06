package q1307;

import java.util.Scanner;

class AlphabetSquare{
	private char[] alph;
	private int n;
	
	public AlphabetSquare(int n) {
		this.n = n;
		alph = new char[n*n];
		for(int i = 65, j= 0; j < alph.length; i++, j++) {
			if(i == 91) {
				i = 65;
			} 
			this.alph[j] = (char)i;
		}
	}
	
	public void printSquare() {
		for(int i = 0; i < n; i++) {
			for(int j = 0, k = 1; j < n; j++, k += n) {
				System.out.print(this.alph[alph.length - i - k] + " ");
				}
			System.out.println();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		AlphabetSquare alp = new AlphabetSquare(n);
		alp.printSquare();
	}
}
