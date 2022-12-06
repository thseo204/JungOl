package q9009;

class AB{
	private int a;
	private char b;
	
	public AB(int a, char b) {
		this.a = a;
		this.b = b;
	}
	
	public void printAB() {
		System.out.printf("a = %d\nb = %c\n", a, b);
	}
}

public class Main {
	public static void main(String[] args) {
		AB ab = new AB(10, 'A');
		ab.printAB();
	}
}
