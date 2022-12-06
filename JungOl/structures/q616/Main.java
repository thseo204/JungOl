package q616;

import java.util.Scanner;

class Triangle{
	private int[] x;
	private int[] y;
	
	public Triangle(int[] x, int[] y) {
		this.x = x;
		this.y = y;
	}
	
	public void getCenterOfGravity() {
		int xSum = 0, ySum = 0;
		for(int i = 0; i < this.x.length; i++) {
			xSum += this.x[i];
			ySum += this.y[i];
		}
		double xGra = (double)xSum / this.x.length;
		double yGra = (double)ySum / this.x.length;
		
		System.out.printf("(%.1f, %.1f)", xGra, yGra);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		int[] y = new int[3];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt(); 
		}
		sc.close();
		
		Triangle t = new Triangle(x, y); 
		
		t.getCenterOfGravity();
	}
}
