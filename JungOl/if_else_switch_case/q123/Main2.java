package q123;

import java.util.Scanner;

class Animal{
	private int num;
	
	public Animal(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public String printAnimal() {
		String ani = "";
		switch(getNum()){
		case 1:
			ani = "dog";
			break;
		case 2:
			ani = "cat";
			break;
		case 3:
			ani = "chick";
			break;
		default :
			ani = "I don't know.";
		}
		return ani;
	}
}

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number? ");
		int inp = sc.nextInt();
		sc.close();
		
		Animal ani = new Animal(inp);
		System.out.println(ani.printAnimal());
	}
}
