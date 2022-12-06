package q9004;

class Print{
	public void getPrint() {
		for(int i = 1; i < 5; i++) {
			for(int j = 4; j >= 1; j--) {
				if(j == i) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			for(int j = 1; j <= 4; j++) {
				if(j == i) {
					System.out.print("@");
				} else if(i > j) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 0; j < 4; j++) {
				if(i == j) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			
			for(int j = 3; j >= 1; j--) {
				if(j == i) {
					System.out.print("@");
				} else if(i < j){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Print p = new Print();
		p.getPrint();
	}
}
