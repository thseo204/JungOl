package q523;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		System.out.printf("%d > %d --- %b\n", inp1, inp2, inp1 > inp2);
		System.out.printf("%d < %d --- %b\n", inp1, inp2, inp1 < inp2);
		System.out.printf("%d >= %d --- %b\n", inp1, inp2, inp1 >= inp2);
		System.out.printf("%d <= %d --- %b\n", inp1, inp2, inp1 <= inp2);

//		---------------------------------------------------------------------------

		boolean b1 = inp1 > inp2;
		boolean b2 = inp1 < inp2;
		boolean b3 = inp1 >= inp2;
		boolean b4 = inp1 <= inp2;

		System.out.print(inp1 + " > " + inp2 + " --- ");
		if (inp1 > inp2) {
			System.out.println(b1);
		} else {
			System.out.println(b1);
		}

		System.out.print(inp1 + " < " + inp2 + " --- ");
		if (inp1 < inp2) {
			System.out.println(b2);
		} else {
			System.out.println(b2);
		}

		System.out.print(inp1 + " >= " + inp2 + " --- ");
		if (inp1 < inp2) {
			System.out.println(b3);
		} else {
			System.out.println(b3);
		}

		System.out.print(inp1 + " <= " + inp2 + " --- ");
		if (inp1 < inp2) {
			System.out.println(b4);
		} else {
			System.out.println(b4);
		}
		//-----------------------------------------------------------------------------
		boolean r = (inp1 > inp2) ? true : false;
		System.out.println(inp1 + " > " + inp2 + " --- " + r);
	}
}
