package q9007;

class Print {
	public void getPrint() {
		System.out.println("수식을 출력하면 계산 결과가 출력됩니다.");
		System.out.print("10 + 5 = ");
		System.out.println(10 + 5);
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.", 2005, 6, 17);
	}
}

public class Main {
	public static void main(String[] args) {
		Print p = new Print();
		p.getPrint();
	}
}
