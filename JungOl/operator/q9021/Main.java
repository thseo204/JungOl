package q9021;

class AB{
	private int a;
	private int b;
	
	public AB() {
		this.a = 10;
		this.b = 10;
	}
	
	public void print() {
		System.out.println("최초값 a = " + a + ", b = " + b);
		System.out.println();
		System.out.println("a++ = " + a++ + ", ++b = " + ++b);
		System.out.println("실행후 a = " + a + ", b = " + b);
		System.out.println();
		System.out.println("a-- = "+ a-- + ", --b = " + --b);
		System.out.println("실행후 a = " + a + ", b = " + b);
	}
}

public class Main {
	public static void main(String[] args) {
		AB ab = new AB();
		ab.print();
	}
}
