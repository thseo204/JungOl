package q9011;

class Print {
	private int num1;
	private int num2;

	public Print(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void reSetPrint(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void printSum() {
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
	}
}

public class Main {
	public static void main(String[] args) {
		Print p = new Print(10, 20);
		p.printSum();
		p.reSetPrint(30, 40);
		p.printSum();
	}
}
