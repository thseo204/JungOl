package q1840;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] cheese = new int[row][col];

        for (int i = 0; i < cheese.length; i++) {
            for (int j = 0; j < cheese[i].length; j++) {
                cheese[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
        for (int i = 0; i < cheese.length; i++) {
            for (int j = 0; j < cheese[i].length; j++) {
                if(i == 0 && j == 0){
                    continue;
                } else if(i == 0 || j != 0){
                    continue;
                } else if(i != 0 && j != 0){

                }

            }
        }

        // 현재 치즈 모양 출력 test
        for (int i = 0; i < cheese.length; i++) {
            for (int j = 0; j < cheese[i].length; j++) {
                System.out.print(cheese[i][j] + " ");
            }
            System.out.println();
        }
    }
}
