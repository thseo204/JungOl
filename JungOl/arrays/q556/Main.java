package q556;

public class Main {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num[i] = i + 1;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}