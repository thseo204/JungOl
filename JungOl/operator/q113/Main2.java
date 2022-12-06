package q113;

import java.util.Scanner;

class Rectangle1{
	private int width;
	private int length;
	private int area;
	
	public Rectangle1(){
		Scanner sc = new Scanner(System.in);
		width = sc.nextInt();
		length = sc.nextInt();
		sc.close();
		
		width += 5;
		length *= 2;
		area = width * length;
	}
	
	public void printResult() {
		System.out.printf("width = %d\nlength = %d\narea = %d",
				width, length, area);
	}
}

public class Main2 {
	public static void main(String[] args) {
		Rectangle1 rt = new Rectangle1();
		rt.printResult();
	}
}
