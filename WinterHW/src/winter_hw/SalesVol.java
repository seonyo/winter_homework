package winter_hw;

import java.util.Scanner;
public class SalesVol {
   public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      int sale[][]= new int [3][4];
      int total[] = new int [3];
      int aly[]= new int [3];
      int year=2019;
      //입력 및 처리
      for(int i=0; i<sale.length; i++) {
         System.out.print(year +"년도 : ");
         for(int j=0; j<sale[i].length; j++) {
            sale[i][j]=scan.nextInt();
            total[i]+=sale[i][j];
         }
         if(i>0)   aly[i]+=(total[i]+aly[i-1]);
         else aly[i]+=total[i];
         year++;
      }
      year=2019;
      //출력
      System.out.println("\t\t1분기\t2분기\t3분기\t4분기\t연간판매량\t누적판매량");
      for(int i=0; i<sale.length; i++) {
         System.out.print(year+"년도 : \t");
         for(int j=0; j<sale[i].length; j++) {
            System.out.print(sale[i][j]+"\t");
         }
         System.out.println(total[i]+"\t"+aly[i]);
         year++;
      }
   }

}