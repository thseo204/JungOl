package q170;

class Asperand1{
	private char asp = '@';
	private String[] count = {"first", "second", "third"};
	
	public void printAs(){
		for(int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
			for(int j = 0; j < 10; j++) {
				System.out.print(asp);
			}
			System.out.println();
		}
	}
}

public class Main2 {
	public static void main(String[] args) {
		Asperand1 as = new Asperand1();
		as.printAs();
	}
}
