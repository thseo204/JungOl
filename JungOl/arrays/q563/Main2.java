package q563;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		//연수씨 코드
	      Scanner sc = new Scanner(System.in);

	      int[] a = new int[10];
	      int b=0;

	      for (int i = 0; i < 10; i++) {
	         a[i] = sc.nextInt();
	      }
	      sc.close();

	      for (int i = 1; i < 10; i++) {
	         for (int j = 0; j < 10; j++) {
	            if(a[i]>a[j]) {
	               b=a[j];
	               a[j]=a[i];
	               a[i]=b;
	            }
	         }
	      }
	      for(int i=0; i<10;i++) {
	         System.out.print(a[i]+" ");
	      }

	}
}
