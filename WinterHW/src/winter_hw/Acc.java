package winter_hw;

import java.util.Scanner;

class Account{
   //멤버변수 선언
   String Acc_num;
   int total;
   //생성자
   Account(String Acc_num, int total){
      this.Acc_num = Acc_num;
      this.total=total;
   }
   //입금 메서드
   void deposit(int input) {
      total+=input;
   }
   //출금 메서드
   void withdraw(int output) {
      if(total<output) System.out.println("출금하려는 계좌의 잔액이 부족하여 출금이 불가능합니다");
      else total-=output;
   }
   //출력 메서드
   void print() {
      System.out.println("계좌번호 "+ Acc_num + "의 현재 잔액 : "+ total);
   }
}
public class Acc{
   public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      String Acc_num [] = new String [3];
      int total [] = new int[3];
      for(int i=0; i<3; i++) {
         total[i]=0;
         System.out.println("=================================");
         System.out.print("계좌번호 입력 : ");
         Acc_num[i] = scan.next();
         Account ac = new Account(Acc_num[i], total[i]);
         ac.print();
         System.out.println();
         System.out.print("입금할 금액 : ");
         int input = scan.nextInt();
         ac.deposit(input);
         ac.print();
         total[i]+=input;
         System.out.println();
         System.out.print("출금할 금액 : ");
         int output = scan.nextInt();
         ac.withdraw(output);
         ac.print();
         if(total[i]>=output) total[i]-=output;
      }
      System.out.println();
      System.out.println("=================================");
      System.out.println("계좌번호\t\t잔액");
      System.out.println("=================================");
      for(int i=0; i<Acc_num.length; i++) {
         System.out.printf("%s\t\t%5d\n", Acc_num[i], total[i]);
      }
      System.out.println("=================================");
   }
}