package q9008;

class Print{
	private String[] subject = {"korean", "english", "computer"};
	private int[] score = {90, 100, 80};
	
	public void getPrint() {
		System.out.println(" subject score");
		for(int i = 0; i < 14; i++) {
			System.out.print("=");
		}
		System.out.println();
		for(int i = 0; i < subject.length; i++) {
		System.out.printf("%8s %5d\n", subject[i], score[i]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Print p = new Print();
		p.getPrint();
	}
}
