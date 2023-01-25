package q544;

import java.util.Scanner;

public class Main2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        sc.close();

        for(int i = num; i <= 100; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
