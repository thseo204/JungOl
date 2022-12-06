package q508;

public class Main2 {
	public static void main(String[] args) {
		String[] index = new String[] {"item", "count", "price"};
		// new String[] 생략 가능
		String[] str = {"pen", "nete", "eraser"};
		
		System.out.printf("%10s%10s%10s%n", index[0], index[1], index[2]);
		System.out.printf("%10s%10d%10d%n", str[0], 20, 100);
		System.out.printf("%10s%10d%10d%n", str[1], 5, 95);
		System.out.printf("%10s%10d%10d", str[2], 110, 97);
	}
}
