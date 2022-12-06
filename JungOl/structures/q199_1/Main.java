package q199_1;
// 동구씨 코드
import java.util.Scanner;

class Score {
   Scanner sc = new Scanner(System.in);
   private Student[] stu;
   private int N = sc.nextInt();

   public Score() {
      stu = new Student[N];
      for (int i = 0; i < stu.length; i++) {
         String name = sc.next();
         int kor = sc.nextInt();
         int math = sc.nextInt();
         int eng = sc.nextInt();
         stu[i] = new Student(name, kor, math, eng);
      }
   }

   public void print() {
      for (int i = 0; i < stu.length; i++) {
         System.out.println(stu[i].getName() + " " + stu[i].getKor() + " " + stu[i].getMath() + " " + stu[i].getEng()
               + " " + ScoreSum(i));
      }
   }

   public void Sort() {
      Student[] tmp = new Student[N];
      for (int i = 0; i < stu.length; i++) {
         for (int j = 0; j < stu.length; j++) {
            if (ScoreSum(i) > ScoreSum(j)) {
               tmp[i] = stu[j];
               stu[j] = stu[i];
               stu[i] = tmp[i];
            }
         }
      }
   }

   public int ScoreSum(int x) {
      int sum = stu[x].getEng() + stu[x].getKor() + stu[x].getMath();
      return sum;
   }
}

class Student {
   private String name;
   private int kor;
   private int math;
   private int eng;

   public Student(String name, int kor, int math, int eng) {
      this.name = name;
      this.kor = kor;
      this.math = math;
      this.eng = eng;
   }

   public String getName() {
      return name;
   }

   public int getKor() {
      return kor;
   }

   public int getMath() {
      return math;
   }

   public int getEng() {
      return eng;
   }

}

public class Main {

   public static void main(String[] args) {

      Score soc = new Score();
      soc.Sort();
      soc.print();

   }

}