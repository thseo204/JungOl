package q9005;

class Print{
	public void getPrint() {
		System.out.printf("%s\n%s", "서식 문자로 출력하는 방법입니다.", "이것은 문자열을 나타냅니다.");
	}
}

public class Main {
	public static void main(String[] args) {
		Print p = new Print();
		p.getPrint();
	}
}
