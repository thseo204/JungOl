package q1314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        sc.close();

        char[] alph = new char[inp * inp];

        for(int i = 65, j = 0; j < inp * inp; i++, j++){
            if(i == 91){
                i = 65;
            }
            alph[j] = (char)i;
        }

        for(int i = 0; i < inp; i++){
            for(int j = 0, k = i; j < inp; j++){
                if(j % 2 == 0){
                    k += j;
                } else{
//                    k += inp - j;
                    k = k - j;
                }
                System.out.print(alph[k] + " ");
            }
            System.out.println();
        }
    }
}
