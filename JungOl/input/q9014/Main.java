package q9014;

import java.util.Scanner;

class Age {
	private int age;
	
	public Age() {
		System.out.print("당신의 나이는 몇 살입니까? ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		this.age = age;
	}
	
	public void printAge() {
		System.out.println("당신의 나이는 " + age + "살이군요.");
	}
}

public class Main {
	public static void main(String[] args) {
		Age a = new Age();
		a.printAge();
	}
}
