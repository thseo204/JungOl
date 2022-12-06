package q170;

class Asperand{
	private String[] count = new String[3];
	private int c = 0;
	
	public Asperand() {
		this.count[0] = "first";
		this.count[1] = "second";
		this.count[2] = "third";
	}
	
	public int getC() {
		return c++;
	}
	
	public void printAsperand() {
		System.out.println(count[getC()]);
		for(int i = 0; i < 10; i++) {
			System.out.print('@');
		}
		System.out.println();
	}
}

public class Main {
	public static void main(String[] args) {
		Asperand as = new Asperand();
		as.printAsperand();
		as.printAsperand();
		as.printAsperand();
	}
}
