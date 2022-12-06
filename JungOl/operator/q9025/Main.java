package q9025;

class TrueOrFalse {
	private int a;
	private int b;
	private int c;

	public TrueOrFalse() {
		a = 0;
		b = 1;
		c = 2;
	}

	public void print() {
		boolean b1 = a != 0 && b != 0;
		boolean b2 = a != 0 || b != 0;
		boolean b3 = b != 0 && c != 0;
		boolean b4 = a == 0;
		
		int result = 0;
		result = b1 == true ? 1 : 0;
		System.out.print(result + " ");
		result = b2 == true ? 1 : 0;
		System.out.print(result + " ");
		result = b3 == true ? 1 : 0;
		System.out.print(result + " ");
		result = b4 == true ? 1 : 0;
		System.out.print(result + " ");
	}
}

public class Main {
	public static void main(String[] args) {
		TrueOrFalse tf = new TrueOrFalse();
		tf.print();
	}
}
