package q617;

import java.util.Scanner;

class User {
	protected String name;
	protected int height;

	public void setUser(String name, int height) {
		this.name = name;
		this.height = height;
	}

}

class OrderPrint {
	private User[] u = new User[5];
	private int index;

	public OrderPrint() {
		for (int i = 0; i < u.length; i++) {
			u[i] = new User();
		}
	}

	public void setOrderPrint(String name, int height) {
		u[index++].setUser(name, height);
	}

	public void PrintMinheight() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < u.length; i++) {
			min = min < u[i].height ? min : u[i].height;
		}
		for (int i = 0; i < u.length; i++) {
			if (min == u[i].height) {
				System.out.println(u[i].name + " " + u[i].height);
			}
		}
	}
}

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OrderPrint orderH = new OrderPrint();
		
		for(int i = 0; i < 5; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			orderH.setOrderPrint(name, height);
		}
		sc.close();
		
		orderH.PrintMinheight();
	}
}
