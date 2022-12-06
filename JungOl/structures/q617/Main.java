package q617;

import java.util.Scanner;

class Person{
	protected String name;
	protected int height;
	
	Person(){
		
	}
	
	Person(String name, int height){
		this.name = name;
		this.height = height;
	}
	
	public void setHeightMin() {
		int min = Integer.MAX_VALUE;
		min = min < this.height ? min : this.height;
		
	}
	
	public void printHeightMin(int min) {
		System.out.print(this.name + this.height);
	}
}

class MinHeight extends Person{
//	String minName;
//	int minHeight;
	
	public MinHeight() {
		
	}
	
	Person[] p = new Person[5];
	
	
	MinHeight (String name, int height) {
		super(name, height);
		for(int i = 0; i < p.length; i++) {
			p[i] = new Person(name, height);
			super.name = name;
			super.height = height;
		}
	}
	
	public void printMin() {
		int min = Integer.MIN_VALUE;
		for(int i = 0; i < p.length; i++) {
			min = min < p[i].height ? i : i;
		}
		System.out.println(p[min]);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Person[] p = new Person[5];
		
//		for(int i = 0; i < p.length; i++) {
//			String name = sc.next();
//			int height = sc.nextInt();
//			p[i]= new Person(name, height);
//		}
		MinHeight m = new MinHeight();
		
		for(int i = 0; i < 5; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			new MinHeight(name, height);
		}
		sc.close();
		
		m.printMin();
	}
}
