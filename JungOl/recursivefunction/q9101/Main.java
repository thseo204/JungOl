package q9101;

class RecursiveFunction{
	public void print(int n) {
		if(n == 0) {
			return;
		} else {
			System.out.println("홍길동");
			print(n-1);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		RecursiveFunction rf = new RecursiveFunction();
		rf.print(10);
	}
}
