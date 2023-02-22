package winter_hw;
import java.util.Scanner;

class cal{
   int n1;
   int n2;
   cal(int n1,int n2){
      this.n1 = n1;
      this.n2 = n2;
   }
   int plus(int n1, int n2) {
      return n1+n2;
   }
   int minus(int n1, int n2) {
      return n1-n2;
   }
   int multiply(int n1, int n2) {
      return  n1*n2;
   }
   double divide(int n1, int n2) {
      return n1/n2;
   }
   void printResult() {
      System.out.println("===두수의 사칙연산 결과===");
      System.out.println(n1 + " + " + n2 + " = "+ plus(n1,n2));
      System.out.println(n1 + " - " + n2 + " = "+ minus(n1,n2));
      System.out.println(n1 + " * " + n2 + " = "+ multiply(n1,n2));
      System.out.println(n1 + " / " + n2 + " = "+ divide(n1,n2));

   }
}

public class Calculate {
   public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      System.out.print("계산하고자 하는 첫번째 수 입력 : ");
      int n1 = scan.nextInt();
      System.out.print("계산하고자 하는 두번째 수 입력 : ");
      int n2 = scan.nextInt();
      
      cal cl = new cal(n1,n2);
      cl.printResult();
   }
}