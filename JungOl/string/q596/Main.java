package q596;

//import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inp = sc.next();
//		int num = sc.nextInt();
		sc.close();
		char[] c = inp.toCharArray(); // 문자열을 char형 배열로 바꿔준다. 공백또한 인덱스에 포함.
		char[] tmp = new char[c.length];
		
		for (int i = 0; i < c.length; i++) {

			tmp[i] = c[(c.length-1) - i];
		}
//		String str = Arrays.toString(tmp); 
		// 문자 배열을 문자열로 변환. 대괄호에 배열 요소 로 구성되어 출력
//		String[] strArray = tmp[];
//		String str = Arrays
//				.stream(str)
//				.collect(Collecttors.joining());
//		System.out.println(str.substring(num));
	}
}
