package q572;
import java.util.Scanner;
// 선생님 코드
public class Main2 {

   public double area(double r) {
      return r * r * 3.14;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int inp = sc.nextInt();
      sc.close();

      Main2 main = new Main2();
      double d = main.area(inp);
      System.out.printf("%.2f", d);
   }
}