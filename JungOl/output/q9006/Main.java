package q9006;

class Print{
	public void getPrint() {
		System.out.println("수를 출력할 때는 따옴표를 생략합니다.");
		System.out.println(123);
		System.out.printf("%f\n", 6.5);
	}
}

public class Main {
	public static void main(String[] args) {
		Print p = new Print();
		p.getPrint();
	}
}
