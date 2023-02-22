package winter_hw;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//입력
		System.out.print("학생수 입력 : ");
		int stu_num = scan.nextInt();
		System.out.println();
		int score [][] = new int [stu_num][3];
		for(int i=0; i<stu_num; i++) {
			for(int j=0; j<score[i].length; j++) {
				while (true) {
					System.out.print("점수 "+(j+1) + " 입력 : ");
					score[i][j]=scan.nextInt();
					if(score[i][j]>=0 && score[i][j]<=100) break;
					else System.out.print("다시 입력하세요==> ");
				}
			}
			System.out.println();
		}
		
		//처리
		int total [][]= new int [2][stu_num];
		for(int i=0; i<stu_num; i++) {
			int max=score[i][0];
			for(int j=0; j<score[i].length; j++) {
				if(max<score[i][j]){
					max=score[i][j];
				}
				total[0][i]=max;
			}
		}
		
		for(int i=0; i<stu_num; i++) {
			switch(total[0][i]/10) {
			case 10: case 9 : total[1][i]=5; break;
			case 8 : total[1][i]=4; break;
			case 7 : total[1][i]=3; break;
			case 6 : total[1][i]=2; break;
			default : total[1][i]=1; break;
			}
		}
		
		//출력
		System.out.println("==============================================");
		System.out.println("순번\t점수1\t점수2\t점수3\t최고점\t평점");
		System.out.println("==============================================");
		for(int i=0; i<stu_num; i++) {
			System.out.printf("%2d\t%3d\t%3d\t%3d\t%3d\t%2d\n", (i+1),score[i][0],score[i][1],score[i][2], total[0][i], total[1][i]);
		}
		System.out.println("==============================================");
	}
}
