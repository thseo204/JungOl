package q9002;

class Print{
	public void getPrint() {
		System.out.print("두 번째 프로그램입니다. ");
		System.out.println("한 줄에 여러 문장을 출력합니다.");
	}
}

public class Main {
	public static void main(String[] args) {
		Print p = new Print();
		p.getPrint();
	}
}
