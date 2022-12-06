package q508;
public class Main {
	public static void main(String[] args) {
		String col1 = "item";
		String col2 = "count";
		String col3 = "price";
		String row1 = "pen";
		String row2 = "note";
		String row3 = "eraser";
		
		int cPen = 20;
		int cNote = 5;
		int cEra = 110;
		int pPen = 100;
		int pNote = 95;
		int pEra = 97;
		
		System.out.printf("%10s%10s%10s\n", col1, col2, col3);
		System.out.printf("%10s%10d%10d\n", row1, cPen, pPen);
		System.out.printf("%10s%10d%10d\n", row2, cNote, pNote);
		System.out.printf("%10s%10d%10d\n", row3, cEra, pEra);
	}
}
