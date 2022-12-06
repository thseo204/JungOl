package q547;

public class Main {
	public static void main(String[] args) {
		for(int i = 2 ; i < 7; i++) {
			for(int j = 1, k = i; j < 6; j++) {
				System.out.print(k + " ");
				k += 1;
			}
			System.out.println();
		}
	}
}
