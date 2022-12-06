package q9026;

class Operator{
	private int a;
	private int b;
	private int c;
	
	public Operator() {
		a = 0;
		b = 1;
		c = 2;
	}
	
	public void print() {
		int result = 0;
		result = a < b ? 1 : 0;
		System.out.print(result + " ");
		result = a < c ? 1 : 0;
		System.out.print(result + " ");
		result = a == b ? 1 : 0;
		System.out.print(result + " ");
		result = b <= c ? 1 : 0;
		System.out.print(result + " ");
	}
}

public class Main {
	public static void main(String[] args) {
		Operator op = new Operator();
		op.print();
	}
}
