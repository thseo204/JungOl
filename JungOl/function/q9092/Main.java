package q9092;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Score{
//    private Integer[] score; // 내림차순 정렬시 Type 을 Warpper 클래스로 해주어야함.
    private int[] score;

    public Score(int index){
        Scanner sc = new Scanner(System.in);
        score = new int[index];
//        score = new Integer[index]; // 내림차순
        for(int i = 0; i < score.length; i++){
            score[i] = sc.nextInt();
        }
        sc.close();
    }

    public void printSort(){
//        Arrays.sort(score, Comparator.reverseOrder()); // 내림차순 메소드
        Arrays.sort(score);

        for(int i = 0; i < score.length; i++){
            System.out.print(score[i] + " ");
        }
    }
}
public class Main {
    public static void main(String[] args){
        Score s = new Score(6);
        s.printSort();
    }
}
