package q536;

public class Main {
	public static void main(String[] args) {
		int i = 1;
		//2. while loop
		while (i <= 15) {
			System.out.print(i);
			System.out.print(" ");
			i++;
//			System.out.print(i++ + " ");
//			위 문장 세개를 하나로 만들 수 있음.
		}
		System.out.println();
		//1. for loop
//		for (i=1; i<=15; i++) {
//			System.out.print(i);
//			System.out.print(" ");
//			위 두문장을 합쳐서
//			System.out.println(i + " ");
//		}
		//3. do-while loop
		int j = 1;
		do {
			System.out.print(j++ + " ");
		} while (j<=15);
	}
}