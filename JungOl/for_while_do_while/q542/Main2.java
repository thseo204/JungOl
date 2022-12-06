package q542;

public class Main2 {
	public static void main(String[] args) {
		// for-loop
		for(int i = 10; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// while-loop
		int i = 10;
		while(i <= 20) {
			System.out.print(i++ + " ");
		}
		System.out.println();
		
		// do-while- loop
		int j = 10;
		do {
			System.out.print(j++ + " ");
		}while(j <= 20);
		System.out.println();
	}
}