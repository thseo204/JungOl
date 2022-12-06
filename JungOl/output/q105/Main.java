package q105;
public class Main {
	public static void main(String[] args) {
		String[] city = {"Seoul","Pusan","Incheon","Daegu","Gwangju"};
		String[] value = {"10,312,545", "3,567,910", "2,758,296", "2,511,676", "1,454,636"};
		String[] num = {"+91,375", "+5,868", "+64,888", "+17,230", "+29,774"};
		
		System.out.printf("%15s%15s%15s\n", city[0], value[0], num[0]);
		System.out.printf("%15s%15s%15s\n", city[1], value[1], num[1]);
		System.out.printf("%15s%15s%15s\n", city[2], value[2], num[2]);
		System.out.printf("%15s%15s%15s\n", city[3], value[3], num[3]);
		System.out.printf("%15s%15s%15s\n", city[4], value[4], num[4]);
	}
}
