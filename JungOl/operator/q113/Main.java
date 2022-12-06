package q113;

import java.util.Scanner;

class Rectangle{
	private int width;
	private int length;
	private int area;
	
	public Rectangle(int width, int length) {
		this.width = width + 5;
		this.length = length * 2;
		this.area = getWidth() * getLength();
	}
	
	public int getWidth() {
		return this.width;
	}
	public int getLength() {
		return this.length;
	}
	
	public int getArea() {
		return this.area;
	}
	
	public void printRectangle() {
		System.out.printf("width = %d\nlength = %d\narea = %d"
				, getWidth(), getLength(), getArea());
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int length = sc.nextInt();
		sc.close();
		
		Rectangle rt = new Rectangle(width, length);
		rt.printRectangle();
		
	}
}
