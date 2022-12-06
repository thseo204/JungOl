package q9010;

class Swap{
	private int num1;
	private int num2;
	
	public Swap(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void swap() {
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
	}
	
	public void getNumber() {
		System.out.println(num1 + " " + num2);
	}
}

public class Main {
	public static void main(String[] args) {
		Swap sw = new Swap(10, 20);
		sw.swap();
		sw.getNumber();
	}
}
