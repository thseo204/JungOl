package q1307;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        sc.close();

        char[] alph = new char[inp * inp];

        for(int i = 65, j= 0; j < alph.length; i++, j++) {
            if(i == 91) {
                i = 65;
            }
            alph[j] = (char)i;
        }

        int startNum = inp * inp - 1;
        for(int i = startNum; i > startNum - inp; i--){
            for(int j = i, k = 0; k < inp; j -= inp, k++){
                System.out.print(alph[j] + " ");
            }
            System.out.println();
        }
    }
}
