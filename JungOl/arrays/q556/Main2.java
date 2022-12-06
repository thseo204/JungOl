package q556;

//import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		int[] inp = new int[10];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = i + 1;
		}

		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
		
		// Arrays.toString(배열의 참조변수 이름); 은 [ index[0]의 값, index[1]의 값, ...]
		// 의 문자열 형식으로 반환하여 출력하기때문에 정답이 나오지 않음.
//		System.out.println(Arrays.toString(inp));
		
		
		// char 타입은 참조변수의 이름으로 println(); 을 해도 참조변수의 주소가 아닌 인덱스 안의 값이 
		// 띄어쓰기 없이 붙여서 나온다. 
		// 그래서 정답이 나오지 않음.
//		char[] cArr = new char[10];
//
//		for (int i = 0; i < cArr.length; i++) {
//			if(i == 9) {
//				cArr[i] = 10;
//				break;
//			}
//			cArr[i] = (char) (i + 49);
//		}
//		
//		System.out.println(cArr);
	}
}