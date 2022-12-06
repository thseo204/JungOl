package q9012;

class Pi {
	public void print() {
		System.out.printf("원주 = %d * %d * %f = %f\n", 5, 2, 3.14, 5 * 2 * 3.14);
		System.out.printf("넓이 = %d * %d * %f = %f\n", 5, 5, 3.14, 5 * 5 * 3.14);
	}
}

public class Main {
	public static void main(String[] args) {
		Pi p = new Pi();
		p.print();
	}
}
