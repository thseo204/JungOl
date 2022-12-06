package q616;

import java.util.Scanner;

class Point {
	private int x;
	private int y;

	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

class CenterOfGravity {
	private Point[] p = new Point[3];

	public CenterOfGravity() {
		for (int i = 0; i < p.length; i++) {
			p[i] = new Point();
		}
	}

	public void setGravity() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < p.length; i++) {
			int inp1 = sc.nextInt();
			int inp2 = sc.nextInt();
			p[i].setPoint(inp1, inp2);
		}
		sc.close();
	}

	public void printGravity() {
		int sumX = 0, sumY = 0;
		for (int i = 0; i < p.length; i++) {
			sumX += p[i].getX();
			sumY += p[i].getY();
		}

		double gravityX = (double) sumX / p.length;
		double gravityY = (double) sumY / p.length;

		System.out.printf("(%.1f, %.1f)\n", gravityX, gravityY);
	}
}

public class Main2 {
	public static void main(String[] args) {
		CenterOfGravity cg = new CenterOfGravity();
		cg.setGravity();
		cg.printGravity();
	}
}
