package q506;
public class Main {
	public static void main(String[] args) {
		int a = 170;
		double b = 68.600000;
		String str1 = "My height";
		String str2 = "My weight";

//		System.out.println(str1);
//		System.out.println(a);
//		
//		System.out.println(str2);
//		System.out.printf("%9.6f", b);
////		System.out.println(b); 로 하면 소수점 끝 0은 안나옴.
		System.out.printf("%s\n%d\n%s\n%.6f", str1, a, str2, b);
	}
}
