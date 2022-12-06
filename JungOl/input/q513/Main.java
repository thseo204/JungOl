package q513;
public class Main {
	public static void main(String[] args) {
		double yd = 91.44;
		double in = 2.54;
		
		double num1 = yd * 2.1;
		double num2 = in * 10.5;
		
		double yd1 = 2.1;
		double in1 = 10.5;
		
		System.out.printf("%4.1fyd = %.1fcm\n%.1fin = %5.1fcm", yd1, num1, in1, num2);
	}
}
