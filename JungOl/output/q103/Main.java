package q103;
public class Main {
	public static void main(String[] args) {
		char t = 'T';
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(t);
		}
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(t);
		}
		System.out.println();
		
		System.out.printf("%5c%c\n", t, t);
		System.out.printf("%5c%c\n", t, t);
		System.out.printf("%5c%c\n", t, t);
		
	}
}
